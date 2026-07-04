package Inheritance;

import java.util.Scanner;

class Emp2{
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
class Manager2 extends Emp{
    private double bonus ;
    public void setBonus(double bonus){
        this.bonus=bonus;
    }
    public double getSal(){
        //Explicit call of method getSal() of parent class
        double total=super.getSal()+bonus;
        return total;
    }
}
public class UseManager2 {
    static void main() {
        Manager2 boss = new Manager2();
        Scanner sc = new Scanner(System.in);
        boss.setEmp("HEX" , 100000.0);
        System.out.println("Name = "+boss.getName());
        boss.setBonus(2500000.00);
        System.out.println("Total income = "+boss.getSal());
    }
}
