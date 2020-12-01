import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class greatest{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=in.nextInt();
        Integer T[]=new Integer[n];
        System.out.println("Enter elements in the array");
        for(int i=0;i<n;i++)
            T[i]=in.nextInt();
        System.out.println("Enter a number");
        Integer num=in.nextInt();
        System.out.println("Number of elements greater than "+num+": "+count(num,T));
    }

      static <N extends Number,A extends Number> int count(N n,A[] array){
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i].intValue()>n.intValue())
                count++;
        }
        return count;
    }
}
