package Decision;

import java.util.Scanner;

public class Special_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int x = Math.abs(num); // work with digits safely if negative
        int sum = 0;
        int prod = 1;

        // handle the special case for 0 (product of digits should be 0)
        if (x == 0) {
            sum = 0;
            prod = 0;
        } else {
            while (x > 0) {
                int rem = x % 10;
                sum += rem;
                prod *= rem;
                x /= 10;
            }
        }

        if (num == sum + prod) {
            System.out.println(num + " is a SPECIAL number (sum of digits + product of digits equals the number).");
        } else {
            System.out.println(num + " is NOT a special number.");
        }
    }
}
