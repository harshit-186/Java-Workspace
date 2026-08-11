package Interfaces.extend;

interface Shape1 {
    double area();
}
interface Figure{
    String name();
}
interface MyShape extends Shape1 , Figure{
    //Reference of Figure Does not point out the Shape1 methods
}
