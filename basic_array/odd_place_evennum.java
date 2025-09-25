public class odd_place_evennum {
    //to print odd number present in evne index
    public static void main(String[] args) {
        int []arr={1,10,18,17,7,45};
            for (int i=0;i<arr.length;i++){
                if(arr[i]%2==1 && i%2!=0){
                    System.out.println(arr[i]);
                }
            }

        }
    }

