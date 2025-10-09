class Test {
    static int a;
    static {
        a = 10;
        System.out.println("Static block in top-level class");
    }

    public static void main(String[] args) {
        System.out.println("a = " + a);
    }
}
