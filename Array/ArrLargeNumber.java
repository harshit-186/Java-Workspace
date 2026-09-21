package Array;

import java.util.Scanner;

public class ArrLargeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int large = 0;
        int [] arr = new int [5];
        for (int i =0 ; i < arr.length ; i++){
            System.out.println("Enter number : ");
            arr[i] = sc.nextInt();
            large = Math.max(large , arr[i]);
        }
        System.out.println("Largest number is : "+large);
    }
}
