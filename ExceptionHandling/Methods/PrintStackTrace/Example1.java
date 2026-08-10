package ExceptionHandling.Methods.PrintStackTrace;

public class Example1 {
    static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("Divide is " + c);
        } catch (Exception hex) {
          hex.printStackTrace();
          //gives 5 information about the Exception
        }
    }
}
