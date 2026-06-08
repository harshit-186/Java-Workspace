package CLASS;

class Account{
    private int accId=101;
    private String name = "Manish";
    private double balance = 50000.00;

    public void showAcc(){
        System.out.println("Account id is "+accId);
        System.out.println("Acount holder name is "+name);
        System.out.println("Balance is "+balance);
    }
}
public class UseAccount {
    static void main(String[] args) {
        Account obj ;
        obj = new Account();
        obj.showAcc();
    }
}
