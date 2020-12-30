package com.company;
import java.util.Scanner;
public class factExpt {
    public static void main(String[] args) {
        try{
        System.out.println("Enter a number to get the factorial");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        factorial f=new factorial();
        f.fact(n);
    }catch (invalidNum e){
            e.printErr();
        }
  }
}

class invalidNum extends Exception{
    int n;
    invalidNum(int n){
        this.n=n;
    }
    void printErr()
    {
        System.out.println("Invalid Number entered to calculate the factorial: "+n);
    }
}

class factorial{
    public void fact(int n) throws invalidNum
    {
        if(n<0)
            throw new invalidNum(n);
        else
        {
            int f=1;
            for(int i=1;i<n;i++)
                f=f*i;
            System.out.println("Factorial of "+n+" is: "+f);
        }
    }
}