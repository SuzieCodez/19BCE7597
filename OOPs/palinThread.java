import java.util.*;
import java.util.Scanner;

class palinThread{
    static int rev1;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        int temp;
        Thread T1=new Thread() {
            int rem=0,rev=0,temp=n;
            public void run() {
                while(temp>0){
                    rem=temp%10;
                    rev=(rev*10)+rem;
                    temp=temp/10;
                }
                rev1=rev;
            }
        };

        Thread T2=new Thread() {
            public void run() {
                if(rev1==n)
                    System.out.println("The number entered is a Palindrome number ");
                else
                    System.out.println("The number entered isn't a Palindrome number ");
            }
        };
        T1.start();
        T2.start();
    }
}
