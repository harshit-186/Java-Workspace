package Interfaces.extend;

public class Rectangle implements MyShape{
    private int  l , b ;
    public Rectangle(int l , int b){
        this.l=l;
        this.b=b;
    }
    public double area(){
        return l*b;
    }
    public String name(){
        return "Rectangle";
    }
}
