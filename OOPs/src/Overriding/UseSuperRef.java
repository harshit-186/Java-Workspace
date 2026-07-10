package Overriding;
class Ref{
    private String name ;
    public void setName(){
        this.name="HEX";
        System.out.println("Hey! Hi "+name);
    }

}
class ChildRef extends Ref{
    private int id;
    public void setId(){
        this.id=40;
        System.out.println("This id is : "+id);
    }
}
public class UseSuperRef {
    static void main() {
        Ref obj ;
        obj = new ChildRef();
//        obj.setId();//syntax error
        obj.setName();
    }
}
