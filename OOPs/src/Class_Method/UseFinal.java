package Class_Method;
 abstract class Final{
    private final static float PI = 3.14f;//not to be change anymore
    public void display(){
        System.out.println("Override possible");
    }
    public abstract void ok();
    public final void show(){
        System.out.println("Hey hi U can't change me !");
    }
}
    class Finalle extends Final {
    public void ok(){
        System.out.println("I can override it ");
    }
//     public final void show(){};final methods are not to be overide
}
public class UseFinal {
    static void main() {
        Final ref = new Finalle();
        ref.display();
        ref.show();
        ref.ok();
    }
}

