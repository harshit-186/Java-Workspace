package ExceptionHandling.TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;

        System.out.println("Enter a Number : ");
        try {
            a = sc.nextInt();
        }catch (InputMismatchException hex){
            System.out.println("Plz enter int values");
        }

    }
}
