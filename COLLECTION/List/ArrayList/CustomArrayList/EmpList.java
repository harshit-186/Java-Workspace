package COLLECTION.List.ArrayList.CustomArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpList {
    static void main(String[] args) {
        List<Emp> empList = new ArrayList<>();
        Emp e1 = new Emp(22,"APEX" , 80000.0);
        Emp e2 = new Emp(21,"SUMIT" , 60000.0);
        Emp e3 = new Emp(19,"ZIYA" , 40000.0);
        Emp e4 = new Emp(20,"RIYA" , 50000.0);
        Emp e5 = new Emp(24,"AMIT" , 20000.0);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);

        for (Emp x : empList){
            System.out.println(x);//gives hashCode so we override toString() in Emp class
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age, name and salary to remove from List : ");
        int age = sc.nextInt();
        String name = sc.next().toUpperCase();
        double sal = sc.nextDouble();

        Emp e = new Emp(age , name , sal);
        System.out.println("Removed ? "+empList.remove(e));

        System.out.println("After Removing");
        for (Emp x : empList){
            System.out.println(x);
        }
    }
}
