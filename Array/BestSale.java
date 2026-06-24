package Array;

import java.util.Scanner;

public class BestSale {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of salesman : ");
        int n = sc.nextInt();
        int [][] arr = new int [n][];
        int re=0 ;
        int a = 0;
        double av=0;
        for(int i = 0 ; i < n ; i++){
            int sum= 0; int count=0 ;//loop returns make sum and count to 0
            System.out.println("Enter no. of sales of "+(i+1)+": ");
            int x = sc.nextInt();
            System.out.println("Enter sales  : ");
            for (int j = 0 ; j< x ; j++){
                int h = sc.nextInt();
                sum=sum+h;
                count++;
            }
            if (re<=sum){
                re=sum;
            }
            System.out.println("Sum is "+sum);
            double avg = (float)sum/count;
            System.out.println("Avg is "+avg);
            if (av<=avg) {
                av = avg;
                a = i+1;
            }
        }
        System.out.println("The largest sum of sales is : "+re);
        System.out.println("The best sales man's avg is : "+av);
        System.out.println("The best salesman is : "+a);

    }
}
