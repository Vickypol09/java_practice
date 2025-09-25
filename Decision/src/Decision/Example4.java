package Decision;

public class Example4 {
    public static void main(String[] args) {
        int a=5;

        if (a%5==0 && a%7==0){
            System.out.println("Both number is divisble");
        }
        else if (a%7==0) {
            System.out.println("Yes this number is divisble by 7" );
        }
        else if (a%5==0){
            System.out.println("YES this number is divisble by 5" );
        }
        else {
            System.out.println("NO this number is not divisible");
        }
    }
}
