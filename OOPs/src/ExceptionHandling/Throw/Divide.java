package ExceptionHandling.Throw;

import java.util.Scanner;

public class Divide {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter 2 int : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a<=0){
                ArithmeticException hex = new ArithmeticException("Numerator must be +ve");
                throw hex ;
            }
            int c = a/b;
            System.out.println("Division is "+c);
        }
        catch (ArithmeticException hex){
            hex.getMessage();
        }
    }
}
