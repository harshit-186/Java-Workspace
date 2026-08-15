package String_Methods;

public class CompareToIgnoreCase {
    static void main(String[] args) {
        String s1 = new String("AJAY");
        String s2 = new String("AJIT");
        String s3 = new String("ajit");
        String s4 = new String("AJAY");


        //datatype of int compareTo()
        //checks without case-sensitive (+ve defines larger string)
        System.out.println(s2.compareToIgnoreCase(s1));//8
        System.out.println(s1.compareToIgnoreCase(s2));//-8
        System.out.println(s2.compareToIgnoreCase(s3));//0
        System.out.println(s1.compareToIgnoreCase(s4));//0 on equals

    }
}
