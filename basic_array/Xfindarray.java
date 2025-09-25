import java.util.*;

public class Xfindarray{
    public static void main(String[] args){
        // Enter the size
        System.out.println("Enter the size of array");
        // input the size
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        
        int arr[]=new int[size]; // array declare

        // Enter the elements and store
        System.out.println("Enter the elements");
        for(int i=0;i<size; i++)
        {
            arr[i]=sc.nextInt(); // store the arr as per user
        }

        System.out.println("Enter the x value");
        int x=sc.nextInt(); //input the value  of x;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                System.out.println("X found in the index" + i);
                
            }
            // System.out.println("X value dosent found");
            
        }

    }
}