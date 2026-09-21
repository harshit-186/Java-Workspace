package Array;

import java.util.Scanner;

public class ArrFor {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        int sum=0, mum = 0 , count=0, cunt=0;
        for (int i =0; i<5 ; i++){
            System.out.print("Enter Number :");
            arr[i]= sc.nextInt();
            String b = (arr[i]%2==0)?"Even":"Odd";
            sum+=(b.equalsIgnoreCase("Even"))?arr[i]:0;
            count+=(b.equalsIgnoreCase("Even"))?1:0;
            mum+=(!b.equalsIgnoreCase("Even"))?arr[i]:0;
            cunt+=(!b.equalsIgnoreCase("Even"))?1:0;
        }
        System.out.println("Sum of Even no. is : "+sum);
       System.out.println("Avg of Even no. is : "+(float)sum/count);
        System.out.println("Sum of Odd no. is : "+mum);
       System.out.println("Avg of Odd no. is : "+(float)mum/cunt);

    }
}
