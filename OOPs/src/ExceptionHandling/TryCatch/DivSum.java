package ExceptionHandling.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivSum {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 int : ");
        int a = 0 , b = 0;
        try{
            a = sc.nextInt();
            b = sc.nextInt();
            int c = a/b ;
            System.out.println("Div  is "+c);
        }catch (ArithmeticException hex){
//
            System.out.println("Denominator Should not be 0");
        }catch (InputMismatchException hex){
            hex.printStackTrace();
            System.out.println(hex);
            System.exit(0);
        }
        int d = a+b ;
        System.out.println("Sum is "+d);
    }
}
