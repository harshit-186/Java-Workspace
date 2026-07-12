package Overriding;
class Account {
    private int accId;
    private String name ;
    private double balance;

    public Account(int accId, String name, double balance) {
        this.accId = accId;
        this.name = name;
        this.balance = balance;
    }
    public void displayInfo(){
        System.out.print("AccId = "+accId+", Name = "+name+", Balance = "+balance);
    }
    public double getBalance(){
        return balance;
    }
}
class Saving extends Account{
    private double intRate ;
    public Saving(int accId , String name , double balance , double intRate ){
        super(accId , name , balance);
        this.intRate=intRate;
    }
    public double getIncome(){
        double total = getBalance()+(getBalance()*intRate/100.0);
        return total;
    }
    public void displayInfo(){
       super.displayInfo();
        System.out.println(", IntRate = "+intRate);
    }
}
public class UseSaving {
    static void main() {
        Saving obj = new Saving(501, "HEX",570000.00, 20);
        System.out.println("Original Balance : "+obj.getBalance());
//        obj.getIncome();
        obj.displayInfo();
        System.out.println("Final Income : "+obj.getIncome());
    }
}
