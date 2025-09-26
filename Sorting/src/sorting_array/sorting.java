package sorting_array;
import java.util.*;

public class sorting {
    public static void main(String[] args) {
        int []arr={7,18,0,6,-2,-5};
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }


        }
        System.out.println("Array list"+ Arrays.toString(arr));



    }
}
