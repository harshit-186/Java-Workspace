package COLLECTION.List.ArrayList.CustomArrayList;

public class Emp {
    private int age;
    private String name ;
    private double sal ;

    public Emp(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }
    // 1
    public String toString(){
        return "Age : "+age+", Name : "+name+", Salary : "+sal;
    }
}
