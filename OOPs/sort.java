import java.util.*;
import java.lang.*;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = in.nextInt();
        Integer T[] = new Integer[n];
        System.out.println("Enter elements in the array");
        for (int i = 0; i < n; i++)
            T[i] = in.nextInt();
        //Integer sortarr[];
        System.out.println("\nEntered Array:");
        for(int i=0;i<n;i++)
            System.out.println(T[i].intValue());
        sort(T);
        System.out.println("\nSorted Array:");
        for(int i=0;i<n;i++)
            System.out.println(T[i].intValue());
    }

    static <A extends Number> void sort(A[] arr) {
        A temp;
        //Sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].intValue() > arr[j].intValue()) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
