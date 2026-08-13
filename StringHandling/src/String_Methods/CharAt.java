package String_Methods;

public class CharAt {
    static void main() {
        String str = "Jaipur";
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(4));
        try {
            System.out.println(str.charAt(6));//Exception
        }
        catch(IndexOutOfBoundsException hex){
            System.out.println(hex);
        }
    }
}
