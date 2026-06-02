import java.util.Scanner;

public class Divide {
    public static double divide(int a , int b){
        double c = (float)a/b ;
     System.out.println("Divide is "+c);
        return c ;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no. : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        divide(x,y);
    }
}
