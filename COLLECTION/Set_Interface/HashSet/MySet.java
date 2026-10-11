package COLLECTION.Set_Interface.HashSet;

import java.util.HashSet;
import java.util.Set;

public class MySet {
    static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(5);
        mySet.add(15);
        mySet.add(50);
        mySet.add(3);
        mySet.add(25);
        mySet.add(10);
        System.out.println("Size : "+mySet.size());
        System.out.println(mySet);//random output due to hashing

    }
}
