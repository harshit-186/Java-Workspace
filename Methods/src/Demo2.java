import java.util.Scanner;

public class Demo2 {
    public static void add(int a , int b){
        int c = a+b;
        System.out.println("Sum is "+c);
//        return c ;
    }
    public static double divide(int a , int b){
        double c = a/b;
        return c;
    }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x , y ;
      x = sc.nextInt();
      y = sc.nextInt();
      add(x,y);
      double z = divide(x,y);
      System.out.println("Divide is "+z);
    }
}
