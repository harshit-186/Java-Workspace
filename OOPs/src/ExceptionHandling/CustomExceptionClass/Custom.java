package ExceptionHandling.CustomExceptionClass;

import java.util.Scanner;

class InvalidNumerator extends Exception{
    public InvalidNumerator(String msg){
        super(msg);
    }
}
public class Custom {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter 2 int : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a<=0){
                InvalidNumerator hex = new InvalidNumerator("Numerator must be positive");
                throw hex;
            }
            int c = a/b;
            System.out.println("Division is "+c);
        }catch (InvalidNumerator hex){
            System.out.println(hex.getMessage());
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
