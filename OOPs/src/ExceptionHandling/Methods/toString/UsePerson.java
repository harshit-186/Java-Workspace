package ExceptionHandling.Methods.toString;
class Person{
    private int age ;
    private String name ;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString(){//Method of Object class override here to remove the Hashcode
        return "Age = "+age+", Name = "+name;
    }
}
public class UsePerson {
    static void main(String[] args) {
        Person p = new Person(21,"Amit");
        System.out.println(p);//Automatically called the toString() by giving the reference
    }
}
