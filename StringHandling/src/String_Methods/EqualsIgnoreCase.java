package String_Methods;

public class EqualsIgnoreCase {
    static void main(String[] args) {

        String str1 = new String("Welcome");
        String str2 = new String("Welcome");
        String str3 = new String("welcome");

        //Checks by ignoring case-Sensitive
        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.equalsIgnoreCase(str3));//true
        System.out.println(str2.equalsIgnoreCase(str3));//true

    }
}
