package String_Methods;

public class StartEndWith {
    static void main(String[] args) {

        String str = "PROGRAMMING";

        System.out.println(str.startsWith("PRO"));//true
        System.out.println(str.startsWith("GRAM"));//false
        System.out.println(str.startsWith("pro"));

        System.out.println(str.endsWith("GRAMMING"));//true
        System.out.println(str.endsWith("gramming"));//false
    }
}
