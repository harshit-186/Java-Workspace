package Interfaces;

public class Rectangle implements Shape{
    private int l ,b;
    public Rectangle(int l ,int b){
        this.l=l;
        this.b=b;
    }
    public void area(){
        Shape.super.area();
        System.out.println(l*b);
    }
    public String name(){
        return "Rectangle" ;
    }
}
