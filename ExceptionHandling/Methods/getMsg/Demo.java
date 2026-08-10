package ExceptionHandling.Methods.getMsg;

public class Demo {
    static void main(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b ;
            System.out.println("Divide is "+c);
        }catch(Exception hex){
            System.out.println("Some error occurred! : "+hex.getMessage());
            // method of Throwable class inherited by Exception class
            //this method of String datatype and gives the reason behind the exception
        }
    }
}
