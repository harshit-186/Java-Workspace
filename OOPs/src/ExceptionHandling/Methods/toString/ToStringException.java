package ExceptionHandling.Methods.toString;

public class ToStringException {
    static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("Divide is " + c);
        } catch (Exception hex) {
            System.out.println("Some error occurred! : " + hex);
            //gives the Exception class name and Reason of exception
        }
    }
}