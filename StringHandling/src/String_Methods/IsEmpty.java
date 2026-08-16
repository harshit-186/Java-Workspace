package String_Methods;

public class IsEmpty {
    static void main(String[] args) {

        String str ="   ";
        System.out.println(str.isEmpty());//false
        System.out.println(str.isBlank());//true

         str ="";
        System.out.println(str.isEmpty());//true
        System.out.println(str.isBlank());//true

        String ctr = "HEX";
        System.out.println(ctr.isEmpty());
        System.out.println(ctr.isBlank());

    }
}
