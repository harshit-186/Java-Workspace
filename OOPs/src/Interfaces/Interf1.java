package Interfaces;

interface Interf1 {
    // no constructor in interfaces
    void m1();
}
interface Interf2{
    void m2();
}
interface Interf3 extends Interf1,Interf2{
    void m3();
}
//class MyClass implements Interf3{
//    //override m1() , m2() , m3()
//}