package Array;

import java.util.Scanner;

public class DoubleArr {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [3][4];
        for (int i = 0 ; i<arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                System.out.println("Enter value ; ");
                arr[i][j]=sc.nextInt();
            }
        }
        int sum = 0 ;
        for (int i = 0 ; i< arr.length; i++){
            for (int j = 0 ;j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
                sum = sum +arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum is "+sum);
        System.out.println("Avg is "+ (float)sum/12);
    }
}
