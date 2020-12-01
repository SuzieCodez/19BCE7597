import java.util.Scanner;

class perfect{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        checkPerfect(n);
    }
    public static void checkPerfect(int n){
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                s=s+i;
        }
        if(s==n)
            System.out.println(n+" is a Perfect Number");
        else
            System.out.println(n+" is not a Perfect Number");
    }
}
