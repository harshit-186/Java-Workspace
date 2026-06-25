package Class_Method;

import java.util.Scanner;

class Arr{
    public void show(int[] brr) {
        for (int x : brr) {
            System.out.println("Array value is "+x);
        }
    }
        public int sum(int[] brr){
            int total = 0;
            for (int x:brr){
//                System.out.println(x);
                total = total+x;
            }
            return total ;
        }
}
public class UseArr {
    static void main() {
        int [] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+arr.length+" values :");
        for(int i =0 ; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        Arr obj = new Arr();
        obj.show(arr);
        int answer = obj.sum(arr);
        System.out.println("Sum of array values is :"+answer);
    }
}
