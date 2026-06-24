package CLASS;
class PassRef{
    private int i , j ;
    public void setData(int x , int y){
        i = x;
        j = y;
    }
    public void increment(PassRef p){
        p.i=p.i+1;
        p.j=p.j+1;
    }
    public void show(){
        System.out.println("i = "+i+", j = "+j);
    }
}
public class UsePassRef {
    static void main(String[] args) {
        PassRef obj = new PassRef();
        obj.setData(10 , 20);

        System.out.println("Before Increment :");
        obj.show();

        PassRef temp = new PassRef();
        temp.increment(obj);

        System.out.println("After Increment :");
        obj.show();
    }
}
