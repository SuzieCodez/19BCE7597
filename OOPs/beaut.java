package com.company;
import java.util.*;
import java.util.Scanner;
import java.util.Date;

public class beaut {
    public static void main(String[] args) {
        char doWhileChoice;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        Customer c = new Customer(name);
        Date date = new Date();
        String tempName = c.name;
        Visit v = new Visit(tempName, date);
        double sCost = 0, pCost = 0, mCost=0;
        do {
            System.out.println("\nWELCOME TO THE BEAUTY PORTAL " + c.name);
            System.out.println("\nWe offer:");
            System.out.println("1. Membership");
            System.out.println("2. Purchase Products");
            System.out.println("3. Opt for Services");
            System.out.println("4. Bill");
            System.out.println("5. Exit from the beauty portal");
            System.out.println("\n Enter your choice(1-5)");
            int ch = in.nextInt();
            switch (ch) {
                case 1:

                    System.out.println("Do you want to become a member(y/n)");
                    char chhhh = in.next().charAt(0);
                    if (c.isMember() == true && chhhh == 'y')
                        System.out.println("You are already a "+c.memberType+" member");
                    else {
                        System.out.println("\nPlease select the type of membership you want to opt for\n");
                        System.out.println("1. Premium @1000/-");
                        System.out.println("2. Gold @800/-");
                        System.out.println("3. Silver @500/-");
                        System.out.println("4. None");
                        System.out.println("\nEnter your choice(in words)");
                        c.setMemberType(in.next());
                        if(c.memberType.equalsIgnoreCase("Premium"))
                            mCost=1000;
                        else if(c.memberType.equalsIgnoreCase("Gold"))
                            mCost=800;
                        else if(c.memberType.equalsIgnoreCase("Silver"))
                            mCost=500;
                        else
                            mCost= 0.0;
                        System.out.println("Membership Cost: "+mCost);
                    }
                    if (c.memberType == "None") {
                        c.setMember(false);
                    } else {
                        c.setMember(true);
                    }
                    break;
                case 2:
                    char choice;
                    do {
                        System.out.println("Products available in the store:");
                        System.out.println("1. Lakme Lipstick @1000/-");
                        System.out.println("2. Hair Gel @500/-");
                        System.out.println("3. Nail paint @80/-");
                        System.out.println("4. Loreal Shampoo 1L @1000/-");
                        System.out.println("5. Maybelline Eyeliner @350/-");
                        System.out.println("6. Not interested in buying anything");
                        System.out.println("\nWhat do you want to buy");
                        int cho = in.nextInt();
                        switch (cho) {
                            case 1:
                                pCost = pCost + 1000;
                                break;
                            case 2:
                                pCost = pCost + 500;
                                break;
                            case 3:
                                pCost = pCost + 80;
                                break;
                            case 4:
                                pCost = pCost + 1000;
                                break;
                            case 5:
                                pCost = pCost + 350;
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("Oops, this option is not available");
                        }
                        if(cho!=6)
                            System.out.println("\nYou've successfully purchased the product.");
                        System.out.println("\nDo you still want to buy something(y/n)?");
                        choice = in.next().charAt(0);

                    } while (choice == 'y' || choice == 'Y');
                    v.productExpense = pCost;
                    System.out.println("\nTotal Product Expense: " + v.getProductExpense());
                    v.setProductExpense(v.productExpense);
                    break;
                case 3:
                    do {
                        System.out.println("Products available in the store:");
                        System.out.println("1. Massage @1000/-");
                        System.out.println("2. Haircut @500/-");
                        System.out.println("3. Manicure @80/-");
                        System.out.println("4. Hair Spa @1000/-");
                        System.out.println("5. Eye Makeup @350/-");
                        System.out.println("6. Not interested in opting for any available services");
                        System.out.println("\nWhat do you want to buy");
                        int chh = in.nextInt();
                        switch (chh) {
                            case 1:
                                sCost = sCost + 1000;
                                break;
                            case 2:
                                sCost = sCost + 500;
                                break;
                            case 3:
                                sCost = sCost + 80;
                                break;
                            case 4:
                                sCost = sCost + 1000;
                                break;
                            case 5:
                                sCost = sCost + 350;
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("Oops, this option is not available");
                        }
                        if(chh!=6)
                            System.out.println("\nYou've successfully opted for the service.");
                        System.out.println("\nAre you interested in opting for other services(y/n)?");
                        choice = in.next().charAt(0);
                    } while (choice == 'y' || choice == 'Y');
                    v.serviceExpense = sCost;
                    System.out.println("\nTotal Service Expense: " + v.getServiceExpense());
                    v.setServiceExpense(v.serviceExpense);
                    break;
                case 4:
                    DiscountRate d = new DiscountRate();
                    double dP = d.getProductDiscountRate(c.memberType);
                    double dS = d.getServiceDiscountRate(c.memberType);
                    System.out.println("\n   _____________");
                    System.out.println("  |    Bill     |");
                    System.out.println("   _____________");
                    System.out.print("\nCustomer Name: "+c.name);
                    System.out.println("\nDate of Purchase: "+v.date.toString());
                    if(mCost>0) {
                        System.out.println("Membership: " + c.memberType);
                        System.out.println("Membership Cost: " + mCost);
                    }System.out.println("Total expense: " + (v.getTotalExpense()+mCost));
                    if(sCost>0)
                        System.out.println("Discount on Services: " + dS * 100 + " %");
                    if(pCost>0)
                        System.out.println("Discount on Products: " + dP * 100 + " %");
                    double tS = v.serviceExpense - v.serviceExpense * dS;
                    double tP = v.productExpense - v.productExpense * dP;
                    System.out.println("Payable Amt.: " + (tS + tP+ mCost));
                    System.out.println("\nThank you for visiting our beauty portal!!!");
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("Thank you for visiting our beauty portal!!!");
                    System.exit(0);
            }
            System.out.println("\nType 'y' to go back to the menu");
            doWhileChoice=in.next().charAt(0);
        }while(doWhileChoice=='y');
    }
}

class Customer{
    String name,memberType="None";
    boolean member=false;

    Customer(String name){
        this.name=name;
    }

    public String getName(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your name");
        name=in.next();
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }
}

class Visit extends Customer{
    String customer;
    Date date;
    double serviceExpense;
    double productExpense;

    Visit(String name, Date date){
        super(name);
        this.date=date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getTotalExpense(){
        return productExpense+serviceExpense;
    }
}

class DiscountRate{
    static double serviceDiscountPremium=0.2;
    static double serviceDiscountGold=0.15;
    static double serviceDiscountSilver=0.1;
    static double productDiscountPremium=0.1;
    static double productDiscountGold=0.1;
    static double productDiscountSilver=0.1;

    public static double getServiceDiscountRate(String s){
        if(s.equalsIgnoreCase("Premium"))
            return serviceDiscountPremium;
        else if(s.equalsIgnoreCase("Gold"))
            return serviceDiscountGold;
        else if(s.equalsIgnoreCase("Silver"))
            return serviceDiscountSilver;
        else
            return 0.0;
    }

    public static double getProductDiscountRate(String s){
        if(s.equalsIgnoreCase("Premium")||s.equalsIgnoreCase("Gold")||s.equalsIgnoreCase("Silver"))
            return productDiscountPremium;
        else
            return 0.0;
    }
}