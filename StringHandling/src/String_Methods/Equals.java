package String_Methods;

public class Equals {
    static void main() {
        // it is a method of Object class and String class Overridden it
        String str1 = new String("Welcome");
        String str2 = new String("Welcome");
        String str3 = new String("welcome");

        //Checks in case-Sensitive manner
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//false
        System.out.println(str2.equals(str3));//false




    }
}
