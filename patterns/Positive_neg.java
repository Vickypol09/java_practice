import java.util.*;

public class Positive_neg{
    public static void main(String[] args){
        System.out.println("Enter the number to print stars");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=0;i<=num;i++)
        {
            for(int j=0;j<=num;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}