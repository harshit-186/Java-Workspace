package Interfaces.extend;

public class Circle implements MyShape{
    private int radius ;
    public Circle(int radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*Math.pow(radius,2);
    }
    public String name(){
        return "circle";
    }
}
