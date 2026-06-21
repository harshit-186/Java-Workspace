package Loops;

import java.util.Scanner;

class NestedArr {
   public static void main() {
int []arr = new int [5];
Scanner sc = new Scanner(System.in);
int sum = 0;
for (int i= 0; i<5; i++){
    System.out.println("Enter number :");
    arr[i]=sc.nextInt();
    sum = sum +arr[i];
//    System.out.println(arr[i]);
}
       System.out.println("Sum is"+ sum);
       System.out.println("Avg is"+ (float)sum/5);
    }
}
