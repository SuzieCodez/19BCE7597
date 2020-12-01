import java.util.*;
import java.util.Scanner;

class matSquare {
    int r, c, a[][],tr[][];
    static Scanner in = new Scanner(System.in);

    matSquare(int n, int m) {
        this.r = n;
        this.c = m;
        a = new int[n][m];
        tr= new int[m][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = 0;
    }

    public static void main(String[] args) {
        System.out.println("Enter the total no.of rows");
        int a= in.nextInt();
        System.out.println("Enter the total no.of columns");
        int b= in.nextInt();
        matSquare m = new matSquare(a,b);
        m.getVal();
        try {
            checkSquare(a, b);
        } catch (NotASquareMatrix exception) {
            System.out.println(exception);
        }
        if(a==b)
            m.transpose();
        m.dispArr();
        try {
            m.checkSym();
        }
        catch (AsymmetricMatrixException exception) {
            System.out.println(exception);
        }
    }

    public void getVal() {
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                System.out.println("Enter value in row " + i + " and column " + j);
                a[i][j] = in.nextInt();
            }
    }

    public void dispArr(){
        System.out.println("\nDimension of the matrix is "+r+"x"+c);
        System.out.println("Entered Matrix:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }

    public void transpose(){
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                tr[i][j] = a[j][i];
    }

    public void checkSym()throws AsymmetricMatrixException {
        if (r != c)
        {
            throw new AsymmetricMatrixException("The entered matrix isn't a square matrix so it isn't a symmetric matrix");
        }
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                if (a[i][j] != tr[i][j]) {
                    throw new AsymmetricMatrixException("The entered matrix is an Assymetric Matrix");
                }
            }
    }

    public static void checkSquare(int r,int c)throws NotASquareMatrix{
        if (r!=c)
            throw new NotASquareMatrix(": The matrix isn't a square matrix");
    }
}

class NotASquareMatrix extends Exception{
    private String s;
    NotASquareMatrix(String s){
        this.s=s;
    }
    public String toString(){
        return "\nException"+s;
    }
}

class AsymmetricMatrixException extends Exception{
    private String s;
    AsymmetricMatrixException(String s){
        this.s=s;
    }
    public String toString(){
        return "\nException: "+s;
    }
}