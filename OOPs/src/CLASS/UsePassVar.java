package CLASS;
class PassVar{
    public void increment(int x , int y){
        x=x+1 ;
        y = y+1 ;
    }
}
public class UsePassVar {
    static void main(String[] args) {
        int i = 10;
        int j = 20 ;
        System.out.println("Before Increment :");
        System.out.println("i = "+i+", j = "+j);

        PassVar obj = new PassVar();
        obj.increment(i,j);

        System.out.println("After Increment : ");
        System.out.println("i = "+i+", j = "+j);
    }
}
