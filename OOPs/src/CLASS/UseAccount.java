<<<<<<< HEAD
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
=======
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
>>>>>>> 59cc401bd7be89b721f9ae9d75938cf86a2d6de9
