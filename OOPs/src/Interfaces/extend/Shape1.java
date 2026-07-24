package Interfaces.extend;

interface Shape1 {
    double area();
}
interface Figure{
    String name();
}
interface MyShape extends Shape1 , Figure{
}
