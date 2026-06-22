package CLASS;
class Add{
    public void show(int a , int b ){
        int c = a+b;
        System.out.println(c);
    }
    public void show(int a , int b , int c ){
        int d = a+b+c;
        System.out.println(d);
    }
    public void show(String a , String b ){
       String c = a+b;
        System.out.println(c);
    }
}
public class UseAdd {
    static void main(String[] args) {
        Add obj = new Add();
        obj.show(20,40);
        obj.show("Good" , "Morning");
        obj.show(10,20,40);
    }
}
