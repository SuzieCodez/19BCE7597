import java.util.Scanner;
class magicSquare{
    static int arr[][],row,col;
    static int r[];
    static int c[];
    static int d[];
    public static void main(String[] args) {
        entry();
        System.out.println("Entered array: ");
        disp();
        sum();
        intCheck();
        checkMagic();
    }
    public static void disp() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

   public static void sum(){
        int sr=0,sc=0,sd1=0,sd2=0;
        for(int i=0;i<row;i++){
            sd2=sd2+arr[i][row-(i+1)];
        }
       //System.out.println("Sum of diagonal-2: "+sd2);
        d[1]=sd2;
      for(int i=0;i<row;i++)
      {
          for(int j=0;j<col;j++)
          {
              sc=sc+arr[j][i];
              sr=sr+arr[i][j];
              if(i==j)
                  sd1=arr[i][j]+sd1;
          }
          r[i]=sr;
          c[i]=sc;
          //System.out.println("Sum of row-"+i+": "+sr);
          //System.out.println("Sum of columns-"+i+": "+sc);
          sr=0;sc=0;
      }
       //System.out.println("Sum of diagonal-1: "+sd1);
      d[0]=sd1;
   }

   public static void checkMagic(){
       boolean rc=true,cc=true,dc=true;
        //diagonal sum check
        if(d[0]!=d[1])
            dc=false;
        //row & column sum check
       int i=0;
       for(int j=i+1;j<row-1;j++)
            {
              if(r[i]!=r[j])
                  rc=false;
              if(c[i]!=c[j])
                  cc=false;
            }
        if(rc==true && dc==true && cc==true)
            System.out.println("It's a magic square");
        else
            System.out.println("User didn't enter a magic square");
   }

    public static void entry(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter number of rows and columns");
        row=in.nextInt();
        col=in.nextInt();
        arr=new int[row][col];
        System.out.println("Enter numbers in the array");
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++) {
                System.out.println("Row " + i + "Column " + j + ": ");
                arr[i][j] = in.nextInt();
            }
        r=new int[row];
        c=new int[col];
        d=new int[2];
    }

    public static void intCheck() {
        boolean same = false;
        int i;
        for (int l = 0; l < row; l++) {
            for (int k = 0; k < row; k++) {
                i = 0;
                for (i = 0; i < row; i++) {
                    for (int j = 0; j < row; j++) {
                        if((k==i && l==j)||(k==j &&l==i))
                            continue;
                        if (arr[k][l] == arr[i][j])
                            same = true;
                    }
                }
            }
        }
        if(same==false)
        System.out.println("Numbers entered by the user are distinct");
        else
            System.out.println("Numbers entered by the user are not distinct");
    }
}