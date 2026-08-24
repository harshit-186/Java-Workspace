package String_Buffer.String_Buffer_Methods;

public class EnsureCapacity {
    static void main(String[] args) {
        StringBuffer str = new StringBuffer("Aditya");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());

        str.ensureCapacity(50);
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());

        str.ensureCapacity(80);
        System.out.println(str.capacity());//102
        //according to formula

    }
}
