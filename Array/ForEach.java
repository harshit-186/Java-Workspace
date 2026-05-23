package Array;

import java.util.Scanner;

public class ForEach {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int n = 0,m=0;
        for(int i = 1 ; i<5;i++){
            if(arr[i]>arr[i-1])
                n = 0+arr[i];
            else
                m = 0+arr[i-1];
        }if(n>m)
            System.out.println("largest no. is "+n);
        else
            System.out.println("Largest no. is "+m);
    }
}
