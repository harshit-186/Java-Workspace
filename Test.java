import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
         String choice;
        for( ; ; )
        {
             System.out.println("Enter 2 int : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("sum is"+(a+b));
            System.out.println("Do you want to continue (yes/no)");
            choice =sc.next();
            if(!choice.equalsIgnoreCase("yes"))
                {
                    System.out.println("Program Terminate");
                    break;
                }
            
        }
    }
}