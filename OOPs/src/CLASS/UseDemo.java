<<<<<<< HEAD
package CLASS;
class Demo {
    //Methods overloading
    public void show(int x){
        System.out.println("Int is "+x);
    }
    public void show(double x){
        System.out.println("Double is "+x);
    }
    public void show(long x){
        System.out.println("Long is "+x);
    }
    public void show(String x){
        System.out.println("String is "+x);
    }
}
public class UseDemo {
    static void main(String[] args) {
        Demo obj1= new Demo();
        obj1.show("Hello");//show (String)
        obj1.show((byte)100);//show (int)
        obj1.show(100L);//show (long)
        obj1.show(25);//show (int)
        obj1.show('A');//show (int)
        obj1.show(2.5f);//show (double)
        //obj1.show(true); // error
    }

}
=======
package CLASS;
class Demo {
    //Methods overloading
    public void show(int x){
        System.out.println("Int is "+x);
    }
    public void show(double x){
        System.out.println("Double is "+x);
    }
    public void show(long x){
        System.out.println("Long is "+x);
    }
    public void show(String x){
        System.out.println("String is "+x);
    }
}
public class UseDemo {
    static void main(String[] args) {
        Demo obj1= new Demo();
        obj1.show("Hello");//show (String)
        obj1.show((byte)100);//show (int)
        obj1.show(100L);//show (long)
        obj1.show(25);//show (int)
        obj1.show('A');//show (int)
        obj1.show(2.5f);//show (double)
        //obj1.show(true); // error
    }

}
>>>>>>> 59cc401bd7be89b721f9ae9d75938cf86a2d6de9
