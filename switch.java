import java.util.*;
public class switch {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
   

    switch(button) {
        case 1 : System.out.println("Namaste");
        break;
        case 2 : System.out.println("hello");
        break;
        case 3 : System.out.println("Nihau");
        break;
        default : System.out.println("Invalid");
    }
}
}
