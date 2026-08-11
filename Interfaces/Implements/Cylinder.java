package Interfaces.Implements;

public class Cylinder implements Shape{
    private int r , h;
    public Cylinder(int r, int h){
        this.r=r;
        this.h=h;
    }
    public String name(){
        return "Cylinder";
    }
    public double cal(){//this method remove the recursion
        return Math.PI*Math.pow(r,2);
    }
    public double area(){
        return 2*Math.PI*Math.pow(r,2)+2*Math.PI*r*h;
    }
    public double volume(){
        return cal()*h;
    }
}
