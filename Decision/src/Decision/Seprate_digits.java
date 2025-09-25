package Decision;
//sperate the digits using for loop
public class Seprate_digits {
    public static void main(String[] args) {
        for (int num=123; num!=0;num=num/10){
            int rem=num%10;
            System.out.println(rem);
        }
    }

}
