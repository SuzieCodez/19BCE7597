import java.util.Scanner;
class Reverse{
    static int num=0,rev=0;
//using loop
    public static int find(int n) {
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String []a){
        ReverseR r=new ReverseR();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        num=in.nextInt();
        System.out.println("Entered number: "+num);
        int rev1=find(num);
        System.out.println("Reverse of the number from find(): "+rev1);
        //System.out.println(num);
        int rev2=r.find(num);
        System.out.println("Reverse of the number from overridden find(): "+rev2);
    }
}
class ReverseR extends Reverse{
    static int r=1,rev=0;
   //using recursion
    public static int find(int n){
        if(n>0){
            find(n/10);
            rev=rev+(n%10)*r;
            r=r*10;
        }
        return rev;
    }
}