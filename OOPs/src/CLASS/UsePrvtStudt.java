package CLASS;

import java.util.Scanner;

class Studt{
     private int roll;
    private String name ;
    private double per;

    public void setData(int r, String n, double p){//parametrized method
        roll= r;
        name=n;
        per=p;
    }
    public void showData(){//non parametrized method
        System.out.println("Roll = "+roll+", Name = "+name+", Per = "+per);
    }
 }

public class UsePrvtStudt {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Studt s1 = new Studt();
        System.out.print("Enter roll : ");
        int a = sc.nextInt();
        System.out.print("Enter name : ");
//       sc.next();
        String b = sc.next();
        System.out.print("Enter per : ");
        double c = sc.nextDouble();
        s1.setData(a,b,c);
        s1.showData();

    }
}
