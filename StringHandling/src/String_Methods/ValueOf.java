package String_Methods;

public class ValueOf {
    static void main(String[] args) {

        //opposite of parseInt method of Wrapper class
        //static method of string called by class name
        //convert every datatype into String
        int x = 25;
        String str = String.valueOf(x);
        System.out.println(str);

        double pi = 3.14;
        String ctr = String.valueOf(pi);
        System.out.println(ctr);

        //another way to convert values in String
        int  z = 30 ;
        String s = z + "";
        System.out.println(s);
    }
}