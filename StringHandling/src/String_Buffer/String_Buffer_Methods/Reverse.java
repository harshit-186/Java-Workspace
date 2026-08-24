package String_Buffer.String_Buffer_Methods;

public class Reverse {
    static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Amit");
        System.out.println(s1);
        System.out.println("Length is : "+s1.length());
        System.out.println(s1.capacity());

        s1.reverse();
        System.out.println(s1);
        System.out.println("Length is : "+s1.length());
        System.out.println(s1.capacity());

    }
}
