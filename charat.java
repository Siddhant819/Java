package day4;
import java.util.*;
public class charat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any string");
        String word = sc.nextLine();
        System.out.println("Every characters in this string are:");
        for(int i=0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }
    }
}
