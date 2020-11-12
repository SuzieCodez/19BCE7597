package com.company;
import java.util.*;
public class StringManipulation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String sc = in.next();
        String s = update(sc);
        System.out.println("New String: " + s);
    }

    //using StringBuilder class to modify the String
    public static String update(String s) {
        StringBuilder sc = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char temp = (char) (i + 1 + '0');
            if (Character.isUpperCase(c) && (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'))
                sc.setCharAt(i, '2');
            else if (Character.isLowerCase(c) && (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'))
                sc.setCharAt(i, '3');
            else if (Character.isUpperCase(c) && !(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'))
                sc.setCharAt(i, '4');
            else if (Character.isLowerCase(c) && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'))
                sc.setCharAt(i, '5');
            else if (Character.isDigit(c))
                sc.setCharAt(i, c);
            else
                sc.setCharAt(i, temp);
        }
        return sc.toString();
    }
}
