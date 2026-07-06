package Inheritance;
class A {
    public A(){
        System.out.println("A constructor is called...");
    }
}
//Calling of non-parametrized Constructor
class B extends A{
    public B(){
        System.out.println("B constructor is called...");
    }
}
public class UseB {
    static void main() {
        B obj = new B();
    }
}
