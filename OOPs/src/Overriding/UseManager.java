package Overriding;
class Emp{
    private double sal;
    public void setSal(){
        this.sal=550000.0;
        System.out.println("Salary is "+sal);
    }
}
class Manager extends Emp{
    private double bonus ;
    public void setBonus(){
        this.bonus=10000.00;
        System.out.println("Bonus is : "+bonus);
    }
}
public class UseManager {
    static void main() {
        Emp obj = new Manager();
        obj.setSal();
//        obj.setBonus();//Syntax error
    }
}
