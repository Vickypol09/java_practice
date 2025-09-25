package Decision;

public class Example7{
    public static void main(String[] args) {
        int temp = 25;

        if (temp > 40) {
            System.out.println("Very Hot");
        } else if (temp >= 30 && temp <= 40) {
            System.out.println("Hot");
        } else if (temp >= 20 && temp <= 29) {
            System.out.println("Warm Temperature");
        } else if (temp >= 10 && temp <= 19) {
            System.out.println("Cold Temperature");
        } else {
            System.out.println("Very Cold");
        }
    }
}
