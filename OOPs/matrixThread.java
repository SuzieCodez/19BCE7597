import java.util.*;
import java.util.Scanner;

public class matrixThread{
    public static void main(String[] args) {
        Thread T1=new Thread(new add());
        Thread T2=new Thread(new multiply());
        T1.start();
        T2.start();
    }
}

class multiply implements Runnable{
    Scanner in=new Scanner(System.in);
    public void run(){
        try {
            Thread.sleep(20000);
        }catch (InterruptedException e )
            {
                System.out.println("T2 interrupted!!!");
            }

        //entering first matirx
        System.out.println("\nEnter the length of the first matrix(rows & columns)");
        int n1=in.nextInt();
        int m1=in.nextInt();
        int a[][]=new int[n1][m1];
        for(int i=0;i<n1;i++)
            for(int j=0;j<m1;j++){
                {
                    System.out.println("Enter value in row "+i+" and column "+j);
                    a[i][j]=in.nextInt();
                }
            }

        //entering sencond matrix
        System.out.println("\n2Enter the length of the second matrix(rows & columns)");
        int n2=in.nextInt();
        int m2=in.nextInt();
        int b[][]=new int[n2][m2];
        for(int i=0;i<n2;i++)
            for(int j=0;j<m2;j++){
                {
                    System.out.println("Enter value in row "+i+" and column "+j);
                    b[i][j]=in.nextInt();
                }
            }

        //finding product
        int p[][] = new int[n1][m2], s = 0, l = 0;
        for (int k = 0; k < n1; k++) {
            for (int i = 0; i <m2; i++) {
                for (int j = 0; j < n1; j++) {
                    s = s +(a[k][j]* b[j][i]);
                }
                p[k][l] = s;
                s = 0;
                l++;
            }
            l=0;
        }

        //printing the product
        System.out.println("\nProduct of the two entered matrices");
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<m2;j++)
                System.out.print(p[i][j]+" ");
            System.out.println();
        }
    }
}

class add implements Runnable {
    Scanner in = new Scanner(System.in);

    public void run() {
        //entering first matirx
        System.out.println("\nEnter the length of the first matrix(rows & columns)");
        int n1 = in.nextInt();
        int m1 = in.nextInt();
        int a[][] = new int[n1][m1];
        for (int i = 0; i < n1; i++)
            for (int j = 0; j < m1; j++) {
                {
                    System.out.println("Enter value in row " + i + " and column " + j);
                    a[i][j] = in.nextInt();
                }
            }

        //entering sencond matrix
        System.out.println("\nEnter the length of the second matrix(rows & columns)");
        int n2 = in.nextInt();
        int m2 = in.nextInt();
        int b[][] = new int[n2][m2];
        for (int i = 0; i < n2; i++)
            for (int j = 0; j < m2; j++) {
                {
                    System.out.println("Enter value in row " + i + " and column " + j);
                    b[i][j] = in.nextInt();
                }
            }

        //storing sum of two matrices
        int s[][] = new int[n1][m1];
        for (int i = 0; i < n1; i++)
            for (int j = 0; j < m1; j++)
                s[i][j] = a[i][j] + b[i][j];

        //printing the sum
        System.out.println("\nSum of the two entered matrices");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++)
                System.out.print(s[i][j] + " ");
            System.out.println();
        }
    }
}