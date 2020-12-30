package com.company;

import java.util.Scanner;

public class Pattern {
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n=in.nextInt();
        for (int i=0;i<n;i++)
        {
            for(int k=i;k<n-1;k++)
                System.out.print(" ");
            for (int j=1;j<=((i*2)+1);j++)
            {
                    if(j%2==0)
                        System.out.print(" ");
                    else
                        System.out.print("1");
            }
            System.out.println();
        }
    }
}
