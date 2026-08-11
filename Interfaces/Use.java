package Interfaces;

public class Use {
    public static void main (String[] args){
        Shape s ;

        s = new Circle(5);
        s.name();
        s.area();
        Shape.show();
        //s.show(); error

        s = new Rectangle(10,20);
                s.name();
        s.area();
//        s.show();
        Shape.show();

    }

}
