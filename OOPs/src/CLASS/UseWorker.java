package CLASS;

import java.util.Scanner;

class Worker {
    private int hw;
    private double payRate;

    public void setData(int h, double r) {
        hw = h;
        payRate = r;
    }

    public double getSalary() {
        if (hw > 40) {
            double amt = (40 * payRate) + ((hw - 40) * 2 * payRate);
            return amt;
        } else {
            double amt = hw * payRate;
            return amt;
        }
    }
}
public class UseWorker {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours : ");
        int h = sc.nextInt();
        System.out.println("Enter Payrate of a hour :");
        double p = sc.nextDouble();
        Worker obj = new Worker();
        obj.setData(h,p);
        double amount = obj.getSalary();
        System.out.println("Amount is "+amount);
    }

}

