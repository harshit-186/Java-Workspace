package ExceptionHandling.Throws;

import java.io.IOException;
import java.util.Scanner;

public class InputDemo {
    public void acceptInt(){
        Scanner sc = new Scanner(System.in);
        int a ;
        System.out.println("Enter an int : ");
        a = sc.nextInt();
        System.out.println("You inputted "+a);
    }
    public void acceptChar() throws IOException {
        char ch ;
        System.out.println("Enter a char : ");
        ch = (char)System.in.read();//gives IOException to handle it throws keyword used for bypass (checked Exception)
        System.out.println("You inputted "+ch);
    }
}
