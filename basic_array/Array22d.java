
import java.util.*;
public class Array22d {
    public static void main(String[]args){

        System.out.println("Enter the rows and coloums");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int coloum=sc.nextInt();

        //intin the array;

        int[][]arr=new int[row][coloum];

        //storing the array;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){

                arr[i][j]=sc.nextInt();
            }
        }

        //output
        //   for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){

        //         System.out.print(Arrays.toString(arr[i][j]));

                for(int a[]:arr){
                    System.out.println(Arrays.toString(a));
                }
            
            System.out.println();
        }



    }
    

 