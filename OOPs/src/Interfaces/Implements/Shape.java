package Interfaces.Implements;

interface Shape {
    String name();
    double area ();
    default double volume(){
        System.out.println("don't have a volume of this figure");
        return 0.0;
    }
    static void welComeMsg(){
        System.out.println("Welcome Guyzz..!");
    }
}
