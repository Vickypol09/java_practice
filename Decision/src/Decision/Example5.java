package Decision;

public class Example5 {
    public static void main(String[] args) {
        char ch = 'V';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("This letter is in UPPERCASE");

        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("This is letter is in LOWERCASE");
        } else if (ch >= '0' && ch < '9') {
            System.out.println("This contain numric value");
        } else {
            System.out.println(ch + "this dosent any of them char");
        }

    }
}
