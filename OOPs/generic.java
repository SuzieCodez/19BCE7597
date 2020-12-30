package com.company;

/*
public class generic {
    public static void main(String[] args) {
        Data <String,Integer,Integer> obj=new Data<String,Integer,Integer>("Susmita",02,100045);
        obj.print();
    }
}
class Data<d1,d2,d3>{
    d1 ob1;
    d2 ob2;
    d3 ob3;

    Data(d1 ob1, d2 ob2, d3 ob3){
        this.ob1=ob1;
        this.ob2=ob2;
        this.ob3=ob3;
    }

    public void print(){
        System.out.print("\t"+ob1);
        System.out.print("\t"+ob2);
        System.out.print("\t"+ob3);
    }
}
*/

import java.util.Scanner;

class Test
{
    static int c=0;
    // A Generic method example
    static <T> void genericDisplay (T element)
    {
        c++;
        if(c%3==0)
            System.out.println();

        System.out.print(element+" \t ");
    }

    // Driver method
    public static void main(String[] args)
    {
        String ds;
        int di;
        char choice;
        Scanner in=new Scanner(System.in);
        do {
            System.out.println("1. Integer");
            System.out.println("2. String");
            System.out.println("\nPlease mention which type of data you want to enter(1-3)");
            int ch=in.nextInt();
            if(ch==1) {
                System.out.println("Enter the Integer");
                ds = in.next();
                genericDisplay(ds);
            }
            else if(ch==2) {
                System.out.println("Enter the String");
                di = in.nextInt();
                genericDisplay(di);
            }
            System.out.println("Do you want to continue entering data(y/n)");
            choice=in.next().charAt(0);
        }while (choice=='y'||choice=='Y');
    }
}
