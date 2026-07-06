package Inheritance;
class X{
    public X(int x){
        System.out.println("Z constructor called..");
        System.out.println("Value of x is : "+x);
    }
}
//Calling of parametrized Constructor
class Y extends X{
    public Y(){
        super(30);
        System.out.println("Y constructor is called..");
    }
}
public class UseZ {
    static void main() {
        Y obj = new Y();
    }
}
