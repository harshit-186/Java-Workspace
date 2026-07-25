package Interfaces.Implements;

import java.sql.SQLOutput;

public class UseShape {

    static void main(String[] args) {

        Shape.welComeMsg();

        Shape s ;

        s = new Circle(10);
        System.out.println("Name is "+s.name());
        System.out.println("Area is "+s.area());
        System.out.println("Volume is "+s.volume());

        s = new Cylinder(10,30);
        System.out.println("Name is "+s.name());
        System.out.println("Area is "+s.area());
        System.out.println("Volume is "+s.volume());
    }
}
