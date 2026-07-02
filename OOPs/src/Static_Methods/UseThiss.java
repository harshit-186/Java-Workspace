package Static_Methods;
class Thiss{
    private int l,b,h;
    public Thiss(){
        this(0,0,0);
        //chaining
    }
    public Thiss(int s){
        this(s,s,s);
        //one constructor calls the master constructor
    }
    public Thiss(int l ,int b , int h){
        //master constructor
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public void show(){
        System.out.println("length = "+l+",breadth = "+b+", height = "+h);
    }
}
public class UseThiss {
    static void main() {
        Thiss h1=new Thiss();
        Thiss h2=new Thiss(10);
        Thiss h3 = new Thiss(3,5,7);
        h1.show();
        h2.show();
        h3.show();
    }
}
