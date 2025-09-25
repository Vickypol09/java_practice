import java.util.*;

public class Array2d {

    public static void Array2dy(int[][] arr) {
        int row = arr.length;
        int coloum = arr[0].length;

        System.out.println("The array elements are:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloum; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloum; j++) {
                if (arr[i][j] == x) {
                    System.out.println("X value is found in: row = " + i + ", column = " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("X is not found in the array.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");
        int row = sc.nextInt();
        int coloum = sc.nextInt();

        int[][] arr = new int[row][coloum];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < coloum; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Array2dy(arr);
    }
}
