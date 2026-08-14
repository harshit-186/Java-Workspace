package String_Methods.EqualsOverride;

public class UseBox {
    static void main() {
        Box str = new Box(10,20,30);
        System.out.println(str);

        Box ctr = new Box(10,20,30);
        System.out.println(ctr);

        System.out.println("Are str and ctr are equals ? : "+str.equals(ctr));
    }
}
