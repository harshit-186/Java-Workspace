package CLASS;

import java.util.Scanner;

class Student{
  int roll ;
  char grade ;
   double per ;

   public static void output(int a , int b ){
       System.out.println("Roll = "+a);
       System.out.println("Per is = "+b);
   }

}
public class UseStudent {
   public static void main(String[] args) {
       Student s1 = new Student();
       Scanner sc = new Scanner(System.in);
     s1.roll = 21 ;
       s1.grade = 'A';
     s1.per = 89.90;
       System.out.println("Roll= "+s1.roll+", Grade= "+s1.grade+", Per= "+s1.per);
//
       Student s2  = new Student();
       s2.roll = sc.nextInt();
       s2.grade= 'S';
       s2.per = 99.90;
       System.out.println(s2);

    }
}
