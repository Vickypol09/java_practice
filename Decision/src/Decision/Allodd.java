package Decision;
//wjptp print all odd number 1 to 50
public class Allodd {
    public static void main(String[] args) {
        int i=1;
        int ans=0;
        while (i<=50){
            if (i%2!=0){
                ans=i;
                System.out.println("This number  are odd between " + ans);
            }
            i++;

        }

    }
}
