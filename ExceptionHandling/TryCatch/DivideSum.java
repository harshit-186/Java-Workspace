package ExceptionHandling.TryCatch;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideSum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a , b ;
        System.out.println("Enter a First Number : ");
        a = sc.nextInt();
        System.out.println("Enter a Second Number : ");
        b = sc.nextInt();

        try {
            int c = a / b;
           System.out.println("Divide is " + c);
        }catch (ArithmeticException hex){
            System.out.println("Denominator should not be 0");
        }

        int d = a + b ;
        System.out.println("Sum is "+d);
    }
}
