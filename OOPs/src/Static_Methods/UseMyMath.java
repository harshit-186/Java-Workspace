package Static_Methods;
class MyMath {
    public static int add (int x , int y ){
        int z = x+y;
        return z;
    }
    public static int max(int x , int y){
        int z = Math.max(x,y);
        return z;
    }
}
public class UseMyMath {
    static void main() {
        System.out.println("Add of 2 int is : "+MyMath.add(10,20));
        System.out.println("Greater Number is : "+MyMath.max(10,20));
    }
}
