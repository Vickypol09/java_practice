public class evennumber {
    //to print even only number from the given array
    public static void main(String[] args) {
        int []arr={-11,1,4,3,2,6,8};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("This are evren number from arraylist : "+arr[i]);
            }
        }
    }
}
