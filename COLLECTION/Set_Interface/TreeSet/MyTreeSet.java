package COLLECTION.Set_Interface.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {
    static void main(String[] args) {
        Set<Integer> mySet = new TreeSet<>();
        // no duplicates allow and output in Sorting way
        mySet.add(5);
        mySet.add(15);
        mySet.add(50);
        mySet.add(50);
        mySet.add(3);
        mySet.add(5);
        mySet.add(25);
        mySet.add(50);
        mySet.add(10);
        System.out.println(mySet);

        Set<String> myTreeSet = new TreeSet<>();
        myTreeSet.add("HEX");
        myTreeSet.add("ALBADIE");
        myTreeSet.add("DEATH");
        myTreeSet.add("CYPAR");
        myTreeSet.add("DEMON");
        myTreeSet.add("AIRI");
        System.out.println(myTreeSet);// give output in sorted Set

    }
}
