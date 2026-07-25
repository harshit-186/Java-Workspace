package Interfaces.Implements;

public class Circle implements Shape{
    private int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public String name(){
        return "Circle";
    }
    public double area(){
        return Math.PI*Math.pow(radius,2);
    }
}
