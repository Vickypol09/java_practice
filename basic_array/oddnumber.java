public class oddnumber {
    //to find only odd numbers from the array list
    public static void main(String[] args) {
        int [] arr={2,4,11,7,3,6,4,3};
                for(int i=0;i<arr.length;i++){
                    if(i%2!=0){
                        System.out.println("odd values are : "+arr[i]);
                    }
                }
    }
}
