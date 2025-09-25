package Decision;
//wjptp the count of toatl number of digits present in the number

public class Digit_count {
    public static void main(String[] args) {
        int num=423056;
        int count=0;
        while(num>0){
            count++;
            num=num/=10;
        }
        System.out.println("count od digit is " + count);

    }
}
