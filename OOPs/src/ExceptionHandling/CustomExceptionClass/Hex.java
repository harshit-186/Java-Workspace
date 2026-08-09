package ExceptionHandling.CustomExceptionClass;

import java.util.Scanner;

public class Hex {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter 2 int : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a<=0){
                ArithmeticException ex = new ArithmeticException("Numerator must be +ve");
//                throw new ArithmeticException("Numerator must be +ve");
                throw ex ;
            }
            int c = a/b;
            System.out.println("Division is "+c);
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}