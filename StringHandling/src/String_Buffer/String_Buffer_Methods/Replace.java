package String_Buffer.String_Buffer_Methods;

public class Replace {
    static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello World");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());

        str.replace(6,11,"Indians");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());

        str.replace(0,5 , String.valueOf(Math.PI));
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());

    }
}
