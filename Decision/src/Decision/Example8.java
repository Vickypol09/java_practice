package Decision;
///Q to create a greater system

public class Example8 {
    public static void main(String[] args) {

        int student= 99;

        if(student<=100 || student >=90){
            System.out.println("student got grade A");
        }
        else if (student<=75 || student >=89) {
            System.out.println("Student got grade B");

        }else if (student<=60 || student >=75) {
            System.out.println("Student got grade B");

        }else if (student<=40 || student >=59) {
            System.out.println("Student got grade B");

        }
        else {
            System.out.println("student got failed");
        }

    }
}
