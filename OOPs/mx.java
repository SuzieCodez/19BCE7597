import java.util.*;
import java.util.Scanner;

public class mx{

    public static void main(String[] args) {
        System.out.println("The decimal ver. of the greatest element in the array is: ");
        Integer inums[] = { 1, 2, 3, 4, 5 };
        max<Integer> m=new max<Integer>(inums);
    }
}

class max<T extends Number>
{
    T[] num;
    double greatest;

    max(T[] x){
       num=x;
       Max(num);
    }

    public <T extends Number> void Max(T[] num){
        greatest=num[0].doubleValue();
        int c=0;
        for(int i=1;i<num.length;i++) {
            if (greatest < num[i].doubleValue())
                greatest = num[i].doubleValue();
        }
        System.out.println(greatest);
    }
}

