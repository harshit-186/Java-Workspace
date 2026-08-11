package Interfaces.extend;

public class UseMyShape {
    static void main(String[] args) {
        MyShape s ;
        s =new Circle(4);
        System.out.println("Name is "+s.name());
        System.out.println("Area is "+s.area());

        s = new Rectangle(10,50);
        System.out.println("Name is "+s.name());
        System.out.println("area is "+s.area());
    }
}
