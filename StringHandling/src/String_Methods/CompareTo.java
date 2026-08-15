package String_Methods;

public class CompareTo {
    static void main(String[] args) {
        String s1 = new String("AJAY");
        String s2 = new String("AJIT");
        String s3 = new String("ajit");
        String s4 = new String("AJAY");


        //datatype of int compareTo()
        //case-sensitive (+ve defines larger string)
        System.out.println(s2.compareTo(s1));//gives unicode 8
        System.out.println(s1.compareTo(s2));//-8
        System.out.println(s2.compareTo(s3));//-32
        System.out.println(s1.compareTo(s4));//0 on equals



    }
}
