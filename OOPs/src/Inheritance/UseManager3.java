package Inheritance;
class Emp3{
    private String name ;
    private double sal ;
    public Emp3(String name , double sal ){
        this.name=name ;
        this.sal=sal;
    }
    public String getName(){
        return name;
    }
    public double getSal(){
        return sal;
    }
}
class Manager3 extends Emp3{
    private double bonus ;
    public Manager3(String name , double sal , double bonus){
        super(name,sal);
        this.bonus=bonus;
    }
    public Double getIncome(){
        double total;
        total = getSal()+bonus;
        return total;
    }
}
public class UseManager3 {
    static void main() {
        Manager3 obj = new Manager3("Ashish" , 55000.0 , 30000.00);
        System.out.println("Name = "+obj.getName());
        System.out.println("Salary = "+obj.getSal());
        System.out.println("Total income = "+obj.getIncome());


    }
}
