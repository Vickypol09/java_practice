public class Thiskeyword {

    int roll;
    String name;

    Thiskeyword(int roll , String name){
        this.roll=roll;
        this.name=name;

    }

    public static void main(String[] args) {
        Thiskeyword obj1=new Thiskeyword(10,"vicky");
        System.out.println(obj1.name);
        System.out.println(obj1.roll);
    }
}
