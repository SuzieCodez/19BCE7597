import java.util.*;
import java.util.Scanner;

public class beauty{
    public static void main(String[] args) {
        customer c=new customer();
        c.membership();
        c.purchase();
        visit v=new visit();
        v.bill();
        discount d=new discount();
        System.out.println("Your final payable amount= "+d.dis());
    }
}

class customer{
   static Scanner in=new Scanner(System.in);
  static public int membership,tCost=0,mCost=0;
    public void membership(){
        System.out.println("Please select the type of membership you want to opt for\n");
        System.out.println("1. Premium @1000/-");
        System.out.println("2. Gold @800/-");
        System.out.println("3. Silver @500/-");
        System.out.println("4. None");
        System.out.println("\nEnter your choice(1-4)");
        membership=in.nextInt();
        if(membership==1)
            mCost = 1000;
        else if(membership==2)
            mCost = 800;
        else if(membership==3)
            mCost = 500;
        else
            mCost = 0;
        System.out.println("Membership Price: "+mCost);
    }
    public void purchase(){
        char c;
        do{
            System.out.println("Products available in the store:");
            System.out.println("1. Lakme Lipstick @1000/-");
            System.out.println("2. Hair Gel @500/-");
            System.out.println("3. Nail paint @80/-");
            System.out.println("4. Loreal Shampoo 1L @1000/-");
            System.out.println("5. Maybelline Eyeliner @350/-");
            System.out.println("6. I want to exit from the portal");
            System.out.println("\nWhat do you want to buy");
            int ch=in.nextInt();
            switch (ch){
                case 1:
                    tCost=tCost+1000;
                    break;
                case 2:
                    tCost=tCost+500;
                    break;
                case 3:
                    tCost=tCost+80;
                    break;
                case 4:
                    tCost=tCost+1000;
                    break;
                case 5:
                    tCost=tCost+350;
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Oops, this option is not available");
            }
            System.out.println("Purchase done\nDo you still want to buy something(y/n)?");
            c=in.next().charAt(0);
            //System.out.println(tCost);
        }while (c=='y'||c=='Y');
    }
}

class discount extends visit{
   static double dPrice=0.0;
    public double dis(){
        switch (membership){
            case 1:
                System.out.println("Discount: 20%");
                dPrice=tBill-tBill*0.2;
                break;
            case 2:
                System.out.println("Discount: 15%");
                dPrice=tBill-tBill*0.15;
                break;
            case 3:
                System.out.println("Discount: 10%");
                dPrice=tBill-tBill*0.1;
                break;
            case 4:
                System.out.println("Discount: 0%");
                dPrice=tBill;
                break;
        }
        System.out.println(tBill);
        return dPrice;
    }

}
class visit extends customer{
    static int tBill=0;
    public void bill(){
        tBill=mCost+tCost;
        System.out.println("Bill: "+tBill);
    }

}