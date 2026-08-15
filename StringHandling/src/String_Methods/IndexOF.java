package String_Methods;

public class IndexOF {
    static void main(String[] args) {
        String str = "Bhopal";

        //datatype of int
        System.out.println(str.indexOf("pal"));//3
        System.out.println(str.indexOf('a'));//4
        System.out.println(str.indexOf(66));//0 index {also gives unicode of letters}
        System.out.println(str.indexOf("pas"));//gives -1 when no match is found
    }
}
