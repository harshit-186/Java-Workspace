package Array;

import java.util.Scanner;

public class ArrExit {
    static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        if(args.length<2){
            System.out.println("Please enter 2 integer Atleast ");
            System.exit(0);//all is well
        }
        //loop
        int sum=0;
        for(int i =0 ;i < args.length;i++){
            sum=sum+Integer.parseInt(args[i]);
        }
        System.out.println("Sum is "+sum);
    }
}
