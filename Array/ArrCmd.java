
package Array;

public class ArrCmd {
    static void main(String[] args) {
        int sum= 0 ;
        if(args.length<2)
            System.out.println("Please Enter 2 integer :");
        else{//loops
            for (int i = 0; i< args.length; i++){
                int n = Integer.parseInt(args[i]);
                sum = sum+n;
            }
            System.out.println(sum);
        }
    }
}

