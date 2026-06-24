<<<<<<< HEAD
package CLASS;
class Obj{
    private int a ,b , c;
    public Obj(){
        a=b=c=0;
    }
    public Obj(int x){
        a=x;
        b=x;
        c=x;
    }
    public Obj(int x , int y , int z){
        a=x;
        b=y;
        c=z;
    }
    public Obj(Obj p){
       a=p.a;
       b=p.b;
       c=p.c;
    }
    public void show(){
        System.out.println("a="+a + ", b = "+b+", c= "+c);
    }
}
public class UseObj {
    static void main(String[] args) {
        Obj  b1 = new Obj();
        Obj b2 = new Obj(10);
        Obj b3 = new Obj(5,7,9);
        Obj b4 = new Obj(b3);
        b1.show();
        b2.show();
        b3.show();
        b4.show();
    }
}
=======
package CLASS;
class Obj{
    private int a ,b , c;
    public Obj(){
        a=b=c=0;
    }
    public Obj(int x){
        a=x;
        b=x;
        c=x;
    }
    public Obj(int x , int y , int z){
        a=x;
        b=y;
        c=z;
    }
    public Obj(Obj p){
       a=p.a;
       b=p.b;
       c=p.c;
    }
    public void show(){
        System.out.println("a="+a + ", b = "+b+", c= "+c);
    }
}
public class UseObj {
    static void main(String[] args) {
        Obj  b1 = new Obj();
        Obj b2 = new Obj(10);
        Obj b3 = new Obj(5,7,9);
        Obj b4 = new Obj(b3);
        b1.show();
        b2.show();
        b3.show();
        b4.show();
    }
}
>>>>>>> 59cc401bd7be89b721f9ae9d75938cf86a2d6de9
