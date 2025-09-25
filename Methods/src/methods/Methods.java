package methods;

public class Methods {
    // Method that adds two numbers
    public static int sum(int a, int b) {
        int ans = a + b;
        return ans;
    }

    public static void main(String[] args) {
        int c = 10;  // initialize c
        int d = 20;  // initialize d

        int result = sum(c, d); // call the method
        System.out.println("Sum is: " + result);
    }
}




//    // Non-static method (no 'static' keyword here)
//    public int sum(int a, int b) {
//        int ans = a + b;
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        int c = 10;  // initialize c
//        int d = 20;  // initialize d
//
//        // Create object of Methods class to call non-static method
//        Methods obj = new Methods();
//        int result = obj.sum(c, d);
//
//        System.out.println("Sum is: " + result);
//    }
//}
