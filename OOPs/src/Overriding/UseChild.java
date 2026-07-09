package Overriding;
class Parent{
    public void show(int n){
        System.out.println("Parent int n : "+n);
    }
    public void show(String n){
        System.out.println("Parent String : "+n);
    }
}
class Child extends Parent{
    public void show(int n){
        System.out.println("Child int : "+n);
        super.show(n);
    }
    public void show(double n){
        System.out.println("Child double : "+n);
    }
}
public class UseChild {
    static void main() {
        Child obj = new Child();
        obj.show(45);
        obj.show("Hello HEX");
        obj.show(80.90);
    }
}
