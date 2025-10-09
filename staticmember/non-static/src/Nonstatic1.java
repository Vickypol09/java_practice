

public class Nonstatic1 {
    int a;
    String name;

    {
        System.out.println(a);
        System.out.println("ISB 1");
    }

    public static void main(String[] args) {
        //creating multiple object
        Nonstatic1 obj=new Nonstatic1();
        Nonstatic1 obj2=new Nonstatic1();
        Nonstatic1 obj3=new Nonstatic1();

        System.out.println(obj.a);
        System.out.println(obj.name);

        System.out.println(obj2.a);
        System.out.println(obj2.name);

        //asigning the value to the varibale throught object
        obj3.a=30;
        obj3.name="omkar";

        System.out.println(obj3.a);
        System.out.println(obj3.name);

    }
}
