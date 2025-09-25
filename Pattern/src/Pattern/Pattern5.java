package Pattern;

public class Pattern5 {
    public static void main(String[] args) {
        int n=3;
        char s='A';

        for (int i=1;i<=n;i++){
            for (int j=0;j<=i-1;j++){
                System.out.print(s++);
            }
            s='A';
            System.out.println(" ");
        }
    }
}
