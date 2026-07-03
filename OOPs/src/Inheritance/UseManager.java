package Inheritance;

import java.util.Scanner;

class Emp{
    private String name ;
    private double sal ;
    public void setEmp(String name , Double sal ){
        this.name=name;
        this.sal=sal;
    }
    public String getName(){
        return name;
    }
    public double getSal(){
        return sal;
    }
}
class Manager extends Emp{
    private double bonus ;
    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    public double getIncome(){
        //Implicit call of method getSal() of parent class
        double total=getSal()+bonus;//jis class ka object hoga ussi ki parent ka method mana jata h
        return total;
    }
}
public class UseManager {
    static void main() {
        Manager boss = new Manager();
        Scanner sc = new Scanner(System.in);
        boss.setEmp("HEX" , 100000.0);
        System.out.println("Name = "+boss.getName());
        boss.setBonus(2500000.00);
        System.out.println("Total income = "+boss.getIncome());
    }
}
