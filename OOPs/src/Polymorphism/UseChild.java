package Polymorphism;
class Parent {
    public static void show(){
        System.out.println("Show of Parent");
    }
    public void display(){
        System.out.println("Display of Parent");
    }
}
class Child extends Parent{
    public static void show(){
        System.out.println("Show of Child");
    }
    public void display(){
        System.out.println("Display of Child");
    }
}
public class UseChild {
    public static void main (String [] args){
        Parent ref ;
        ref = new Parent();
        ref.show();//Parent.show();
        ref.display();

        ref = new Child();
        ref.show();
        ref.display();
    }
}
