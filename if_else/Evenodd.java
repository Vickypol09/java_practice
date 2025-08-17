import java.util.*;

public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("This is even no.");
        } else {
            System.out.println("This is odd no.");
        }
    }
}
