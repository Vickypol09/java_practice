import java.util.*;

public class Add{
    public static int add(int a , int b){
        int sum;
        sum= a+b;
        return sum;
    }

    public static void main(String[] args){
        System.out.println("Enter the two no.");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int ans= add(a,b);
        System.out.println("Sum of two number is"+ ans);
    }
    
}