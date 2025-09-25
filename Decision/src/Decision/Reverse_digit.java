package Decision;
//wajptp reverse of a number

public class Reverse_digit {
    public static void main(String[] args) {
        int num=234;
        int result=0;
        while (num!=0){
            int rem=num%10;
            result=result*10+rem;
            num=num/10;
        }
        System.out.println("reverse" + result);

    }
}
