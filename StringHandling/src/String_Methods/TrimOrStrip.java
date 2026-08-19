package String_Methods;

public class TrimOrStrip {
static void main(String[] args) {

        String str = "   HELLO HEX   ";
        System.out.println(str.trim());//removes starting and ending spaces
        String ctr = str.trim();
        System.out.println(ctr.length());

        System.out.println(str);
        System.out.println(str.length());

        String ktr = "   HELLO HEX   ";
        System.out.println(ktr.strip());//removes starting and ending spaces same as trim() but strip is adavance version come in 2011

        String vtr = str.strip();
        System.out.println(vtr.length());
    }
}
