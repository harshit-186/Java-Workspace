package Overriding;
class Circle{
    private int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*Math.pow(radius,2);
    }

    public int getRadius() {
        return radius;
    }
}
class Cylinder extends Circle{
    private double heigth;
    public Cylinder(int radius , int height){
        super(radius);
        this.heigth=height;
    }
    public double area(){
        return 2*super.area()+2*Math.PI*getRadius()*heigth;
    }
}
public class UseCylinder {
    static void main() {
        Cylinder obj = new Cylinder(10,20);
        obj.area();
        System.out.println("Area of cylinder : "+obj.area());
    }
}
