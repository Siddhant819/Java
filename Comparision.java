package day4;

import java.util.*;

public class Comparision{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String firstString = sc.nextLine();
        System.out.println("Enter the second string:");
        String secondString = sc.nextLine();
        
        // 1. s1 > s2 : returns +ve value
        // 2. s1 < s2 : returns -ve value
        // 3. s1 == s2: returns 0 
        if (firstString.compareTo(secondString) == 0) {
            System.out.println("Strings are equal");
        } else if (firstString.compareTo(secondString) > 0) {
            System.out.println("First string is greater than the second string");
        } else {
            System.out.println("Second string is greater than the first string");
        }
    }
}

