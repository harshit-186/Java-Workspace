package String_Methods;

public class LastIndexOf {
    static void main(String[] args) {
        String str = "WELCOMEUSER";

        //datatype of int
        System.out.println(str.lastIndexOf("OM"));//4
        System.out.println(str.lastIndexOf('E'));//9 gives last index of E
        System.out.println(str.lastIndexOf(67));//3
        System.out.println(str.lastIndexOf("pas"));//gives -1 when no match is found
    }
}
