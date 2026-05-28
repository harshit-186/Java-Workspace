package Array;

import java.util.Scanner;

public class Arr2D {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [3][3];
        for (int i = 0 ; i<arr.length; i++){
            for (int j =0; j<arr[i].length; j++){
                System.out.println("Enter value ; ");
                arr[i][j]=sc.nextInt();
            }
        }
        int sum = 0 ; int n = arr.length;
        for (int i = 0 ; i< arr.length; i++){
            //left diagonal
            sum= sum + arr [i][i];
            // right diagonal
            sum = sum + arr[i][n-1-i];
            for (int j = 0 ;j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("Sum of diagonal is  "+sum);
//        System.out.println("Avg is "+ (float)sum/12);
    }
}
