package sorting_array;
import java.util.*;

public class Delete_array {
    public static void main(String[] args) {
        // Input array
        int[] input = {16, 8, 10, 8, 7, 18};
        Scanner sc = new Scanner(System.in);

        // Display array and ask user which value they want to delete
        System.out.println("Enter the value to delete " + Arrays.toString(input));
        int value = sc.nextInt();

        int count = 0; // to count how many times 'value' occurs in the array

        // First pass: count occurrences of the value
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                count++; // increase count if value found
            }
        }

        // If value not found in array
        if (count == 0) {
            System.out.println("This value is not present, so delete can't be achieved");
        } else {
            // Create a new array with reduced size (removing all occurrences)
            int output[] = new int[input.length - count];
            int k = 0; // index for output array

            // Second pass: copy only those elements which are NOT equal to 'value'
            for (int i = 0; i < input.length; i++) {
                if (input[i] != value) { // skip elements that match 'value'
                    output[k] = input[i]; // copy element into new array
                    k++; // move to next index in output array
                }
            }

            // Print the new array without the deleted value
            System.out.println(Arrays.toString(output));
        }
    }
}
