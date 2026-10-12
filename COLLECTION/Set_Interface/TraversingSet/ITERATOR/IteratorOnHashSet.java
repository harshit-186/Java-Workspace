package COLLECTION.Set_Interface.TraversingSet.ITERATOR;

import java.util.*;

public class IteratorOnHashSet {
    static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(5);
        mySet.add(15);
        mySet.add(50);
        mySet.add(3);
        mySet.add(25);
        mySet.add(50);
        mySet.add(10);
        System.out.println("Size : "+mySet.size());
        System.out.println(mySet.iterator().getClass().getName());
        Iterator<Integer> it = mySet.iterator();
        while (it.hasNext()){
            int x = it.next();
            System.out.println(x);
        }
    }
}
