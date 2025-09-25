import java.util.Scanner;

public class Function {
    public static void print(String n) {
        System.out.println(n);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        print(name);
    }
}
