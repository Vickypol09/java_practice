package methods;

public class Overloading {


    // add two ints
    public int add(int a, int b) {
        return a + b;
    }

    // add three ints (different parameter count)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // add two doubles (different parameter types)
    public double add(double a, double b) {
        return a + b;
    }

    // add variable number of ints (varargs)
    public int add(int... nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        Overloading  calc = new Overloading ();

        System.out.println(calc.add(2, 3));         // calls add(int,int) -> 5
        System.out.println(calc.add(2, 3, 4));      // calls add(int,int,int) -> 9
        System.out.println(calc.add(2.5, 3.5));     // calls add(double,double) -> 6.0
        System.out.println(calc.add(1,2,3,4,5));    // calls add(int...) -> 15
    }
}
