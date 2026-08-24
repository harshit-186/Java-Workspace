package String_Buffer.String_Buffer_Methods;

public class SetLength {
    static void main(String[] args) {
        StringBuffer str = new StringBuffer("Aditya");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());

        str.setLength(3);
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());

        str.setLength(10);
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());
    }
}
