package String;

public class Immutable1 {
    static void main(String[] args) {
        String str = "I" ;
        System.out.println(str);

         str = str + "Love" ;//still exists in heap area anywhere
        System.out.println(str);

        str = str + "Java";//different reference
        System.out.println(str);
    }
}
