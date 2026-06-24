<<<<<<< HEAD
package CLASS;


 class Const{
     //Declaration
    private int accID;
    private String name ;
    private Double balance;
    public Const(int id , String n , Double bl){// This is parametrized constructor
        accID=id;
        name = n;
        balance=bl;
    }
    public void showConst(){
        //Initialization
        System.out.println("AccId = "+accID);
        System.out.println("Name = "+name);
        System.out.println("Balance = "+balance);
    }
}

public class UseConst {
    static void main(String[] args) {
        Const obj1 = new Const(101 , "MANISH" , 500000.0);
        obj1.showConst();
        Const obj2 = new Const(102 , "HEX" , 9000000.00);
        obj2.showConst();
    }
}
=======
package CLASS;


 class Const{
     //Declaration
    private int accID;
    private String name ;
    private Double balance;
    public Const(int id , String n , Double bl){// This is parametrized constructor
        accID=id;
        name = n;
        balance=bl;
    }
    public void showConst(){
        //Initialization
        System.out.println("AccId = "+accID);
        System.out.println("Name = "+name);
        System.out.println("Balance = "+balance);
    }
}

public class UseConst {
    static void main(String[] args) {
        Const obj1 = new Const(101 , "MANISH" , 500000.0);
        obj1.showConst();
        Const obj2 = new Const(102 , "HEX" , 9000000.00);
        obj2.showConst();
    }
}
>>>>>>> 59cc401bd7be89b721f9ae9d75938cf86a2d6de9
