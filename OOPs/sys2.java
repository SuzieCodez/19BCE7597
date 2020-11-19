import java.util.*;
import java.util.Scanner;

public class sys2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Get a new card");
            System.out.println("2.Withdraw");
            System.out.println("3.Exit");
            card c1 = new card();
            account a1 = new account();
            atm a = new atm();
            int ch = in.nextInt();
            switch (ch) {
                case 1:

                    c1.card_number = (int) (Math.random());
                    c1.pin =(int)(Math.random());
                    break;
                case 2:
                    System.out.println("Enter acc no and balance");
                    a1.acc_number = in.nextInt();
                    a1.balance = in.nextInt();
                    System.out.println("Enter the card number");
                    int c = in.nextInt();
                    System.out.println("Enter pin ");
                    int p = in.nextInt();
                    System.out.println("Enter withdrawl amt");
                    int amt = in.nextInt();
                    a.withdraw(c, p, amt);
                    boolean cho = c1.validatePin();
                    if (cho == true)
                        a1.makeWithdrawl();
                    else
                        System.out.println("Pin Invalid");
                    break;
                case 3:
                    System.exit(0);

            }
            System.out.println("Do you still want to continue(1/0) 0 for exit: ");
            choice = in.nextInt();
        }while(choice == 1);
    }
}

class atm{
    int p,money;
    public boolean withdraw(int temp,int p,int money){
        this.p=p;
        this.money=money;
        startTransaction();
        return true;
    }
    public void startTransaction(){
        System.out.println("Started Transaction...");
    }
    public void endTransaction(){
        System.out.println("End of Transaction!!!");
    }
}

class card extends atm{
    int card_number,pin;
    public boolean validatePin(){
        if(pin==super.p)
        {System.out.println("Pin validation successful!!!");
            return true;}
        else
            return false;
    }
}
class account extends card{
    int acc_number,balance;
    public boolean makeWithdrawl(){
        if(balance>money){
            System.out.println("Transaction successful");
            return true;
        }
        else
        {
            System.out.println("Transaction failed");
            return false;
        }
    }
}
