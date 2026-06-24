
package CLASS;


import java.util.Scanner;
class Circle{
    private int radius ;
    public Circle(){
    }
    public void setRadius(int r){
        radius=r ;
    }
    public void setArea(){
        double area = Math.PI*Math.pow(radius,2);
        System.out.println("Area is "+area);
    }
    public void setCircum(){
        double circ = 2*Math.PI*radius;
        System.out.println("Circumference is "+circ);
    }
}
public class UseCircle {
    static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter radius : ");
        int r = sc.nextInt();
        Circle obj = new Circle();
        obj.setRadius(r);
        obj.setArea();
        obj.setCircum();
    }
}
