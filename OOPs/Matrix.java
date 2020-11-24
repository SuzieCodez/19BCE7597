import java.util.Scanner;

class Matrix {
    static Scanner in=new Scanner(System.in);
    int n,m,a[][];
    Matrix(int n,int m){
        this.n=n;
        this.m=m;
        a=new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                a[i][j]=0;
    }

    public  void getVal(){
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++){
                {
                    System.out.println("Enter value in row "+i+" and column "+j);
                    a[i][j]=in.nextInt();
                }
        }
    }

    public int[][] product(Matrix m2) {

        int p[][] = new int[n][m2.m], s = 0, l = 0;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i <m2.m; i++) {
                for (int j = 0; j < m2.n; j++) {
                    s = s +(a[k][j]* m2.a[j][i]);
                }
                p[k][l] = s;
                s = 0;
                l++;
            }
            l=0;
        }
        return p;
    }

    public void dispArr(){
        System.out.println("Dimension of the matrix is "+n+"x"+m);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n1,M1,n2,M2;
        System.out.println("Enter the dimensions of your frist 2D matrix");
        n1=in.nextInt();
        M1=in.nextInt();
        Matrix m1=new Matrix(n1,M1);
        m1.getVal();

        System.out.println("Enter the dimensions of second your 2D matrix");
        n2=in.nextInt();
        M2=in.nextInt();
        Matrix m2=new Matrix(n2,M2);
        m2.getVal();

        try{
        m1.check(m1.m, m2.n);
        }
        catch (ExceptionWrongMatrixDimension ex){
            System.out.println(ex);
        }
        int p[][]=new int[m1.n][m2.m];
        p=m1.product(m2);
        System.out.println("\nMatrix m1: ");
        m1.dispArr();
        System.out.println("\nMatrix m2: ");
        m2.dispArr();
        System.out.println("\nThe multiplied matrix m1xm2: ");
        System.out.println("Dimension of the matrix is "+m1.n+"x"+m2.m);
        for(int i=0;i<m1.n;i++)
        {
            for(int j=0;j<m2.m;j++)
                System.out.print(p[i][j]+" ");
            System.out.println();
        }
    }

    public void check(int a,int b) throws ExceptionWrongMatrixDimension {
        System.out.println("a="+a+"b="+b);
        if (a==b)
            System.out.println("\nProduct can be carried out as the dimensions are suitable for multiplication");
            else throw new ExceptionWrongMatrixDimension ("The dimensions of the matrix are not suitable to carry out multiplication operation");
    }
}

class ExceptionWrongMatrixDimension extends Exception{
    private String s;
    ExceptionWrongMatrixDimension(String s){
        this.s=s;
    }
    public String toString(){
        return "Exception: "+s;
    }
}
