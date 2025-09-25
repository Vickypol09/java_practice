import java.util.*;

public class Array2{
    public static void main(String[] args){

        System.out.println("Enter the size");
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();

        int arr[]=new int[size]; // size input taken

         System.out.println("Enter the elemnets");

//input loop
        for(int i=0; i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

       
//output loop
        for(int i=0;i<size;i++)
        {
            System.out.println("This is your arr :"+arr[i]);
        }

    }
}