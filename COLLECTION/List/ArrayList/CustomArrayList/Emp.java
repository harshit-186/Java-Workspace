package COLLECTION.List.ArrayList.CustomArrayList;

public class Emp {
    private int  age;
    private String name ;
    private double sal ;

    public Emp(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }
    // 1 toString|()
    public String toString(){
        return "Age : "+age+", Name : "+name+", Salary : "+sal;
    }

    // 2 equals()
    public boolean equals(Object o){
        Emp p = (Emp) o ;
        if(this.age==p.age && this.name.equals(p.name) && this.sal==p.sal )
            return true;
        return false;
    }

}
