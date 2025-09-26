package sorting_array;
import java.util.*;
// to find the largest digit from given array
public class largestelementarray {
    public static void main(String[] args) {
        int[]arr={10,11,-2,1,80,100};
        int max=arr[0];

        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The largest number is : "+ max);
    }
}
// to find the smallest digit from given array
//public class largestelementarray {
//    public static void main(String[] args) {
//        int[]arr={10,11,-2,1,80,100};
//        int min[0];
//
//        for (int i=1;i<arr.length;i++){
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        System.out.println("The largest number is : "+ min);
//    }
//}
