package String_Buffer;

public class Mutable {
    static void main(String[] args) {
        String str = new String("BHOPAL");
        String ctr = new String("BHOPAL");
        System.out.println(str == ctr);//false


       StringBuffer ktr = new StringBuffer("BHOPAL");
        StringBuffer vtr = new StringBuffer("BHOPAL");
        System.out.println(ktr == vtr);//false

        ktr = new StringBuffer("INDORE");
        System.out.println(ktr == vtr);//false





    }
}
