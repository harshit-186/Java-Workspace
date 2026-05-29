package Methods.src;
import java.util.Scanner;

public class Madd {
    public static void add(int a,int b){
        System.out.println("sum is " +(a+b));
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enetr 2 int : ");
        x= sc.nextInt();
        y = sc.nextInt();
        add(x,y);
    }
}
