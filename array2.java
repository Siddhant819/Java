package day3;
import java.util.*;

public class array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3, 6, 8, 37, 87, 65, 4, 68, 23, 9, 34};
        System.out.println("Welcome to Array Searching");
        System.out.println("Enter the number you want to search:");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound) {
            System.out.println("Your number was found in the array");
        } else {
            System.out.println("Your number was not found in the array");
        }
    }

    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while(index < arr.length) {
            if(arr[index] == num) { 
                return true;
            }
            index++;
        }
        return false;
    }
}
