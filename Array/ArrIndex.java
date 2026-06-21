package Array;

import java.util.Scanner;

public class ArrIndex {
    static void main(String[] args) {
        int [] arr ={50,40,70,20,60,85};
        Scanner sc = new Scanner(System.in);
       index: for(int x =0 ; ;x++){
            System.out.print("Enter a no.: ");
            int n = sc.nextInt();
            for (int i =0;i<6;i++) {
                if (n == arr[i]) {
                    System.out.println("Index of num. is " + i);
                     break index;
                }
            }
                System.out.println("Element not found " +
                        "please try again :");
        }
    }
}
