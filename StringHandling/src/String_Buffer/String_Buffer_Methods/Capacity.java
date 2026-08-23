package String_Buffer.String_Buffer_Methods;

public class Capacity {
    static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Amit");
        System.out.println("Length is : "+s1.length());
        // default capacity is 16 and Amit is of 4 total capacity is of 20
        System.out.println("Capacity is : "+s1.capacity());

    }
}
