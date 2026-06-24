
package CLASS;

import java.util.Scanner;

class Rectangle{
    private int l , b ;

    public void setData(int x , int y ){
        l=x;
        b=y;
    }
    public double setArea(){
        double area = l*b;
        return area ;
    }
    public double  setCircum(){
        double circum = 2*(l+b);
        return circum;
    }
}
public class UseRectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int length = sc.nextInt();
        System.out.print("Enter Breadth : ");
        int breadth = sc.nextInt();
        Rectangle obj = new Rectangle();
        obj.setData(length,breadth);
//        obj.setArea();
//        obj.showData();
        double res = obj.setArea();
        System.out.println("Area is "+res);
        res = obj.setCircum();
        System.out.println("Circumference is "+res);
    }
}
