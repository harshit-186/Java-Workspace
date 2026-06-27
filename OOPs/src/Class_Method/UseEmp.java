package Class_Method;
class Emp{
    private int id ;
    private String name ;
    private double sal ;
    private static int nextId=1;

    public Emp(String n , double s){
        name = n ;
        sal = s;
        id=nextId++;
    }
    public void show(){
        System.out.println("id = "+id+", name = "+name+", salary = "+sal);
    }
    public void showNextId(){
        System.out.println("Next Emp will get id = "+nextId);
    }
}
public class UseEmp {
    static void main() {
        Emp e = new Emp("RAHUL" , 45000);
      //  e.show();
       // e.showNextId(); its gives correct o/p
        Emp k = new Emp("KELVIN" , 65000);
        Emp s = new Emp("SANJANA" , 55000);
        e.show();
      //  e.showNextId();// also shows 4
        k.show();
        s.show();

        e.showNextId();
        k.showNextId();
        s.showNextId();

    }
}
