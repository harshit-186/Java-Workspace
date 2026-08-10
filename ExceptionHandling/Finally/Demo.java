package ExceptionHandling.Finally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter 2 int : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("Division is "+c);
        }catch (ArithmeticException hex) {
            System.out.println(hex);
        }
//        catch (InputMismatchException hex){
//           System.out.println(hex.getMessage());
//        }
        finally {//Java gives guarantee execution of finally block
            System.out.println("Have a Good Day!");
        }
    }
}
