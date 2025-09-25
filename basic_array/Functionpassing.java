import java.util.*;

public class Functionpassing{
    public static void main(String[] args){
        int [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr)); // output 
        change(arr); // function calling 
        System.out.println(Arrays.toString(arr));// it print and prove that it is changing the array value so it called mutable because object get changed

    }

    static void change(int[] arr){
        arr[0]=99;
    }


}