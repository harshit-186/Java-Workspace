package Array;

import java.util.Scanner;

public class ArrLargeNo {
    static void main(String[] args) {
        int [] arr = new int [5] ;
        int large = 0;
        Scanner sc = new Scanner(System.in);
        for (int i =0 ; i<arr.length ; i++){
            System.out.println("Enter number : ");
            arr[i] = sc.nextInt();
            large  = Math.max(large,arr[i]);
        }
        System.out.println("Largest number is "+large);
    }
}
