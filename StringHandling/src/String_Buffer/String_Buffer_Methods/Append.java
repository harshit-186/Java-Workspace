package String_Buffer.String_Buffer_Methods;

public class Append {
    static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Hello");
        System.out.println("Length is : "+s1.length());
        // default capacity is 16 and Amit is of 4 total capacity is of 20
        System.out.println("Capacity is : "+s1.capacity());
        s1.append(" User");
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.capacity());//never reduces

        s1.append("\nWelcome to Java");
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.capacity());

    }
}
