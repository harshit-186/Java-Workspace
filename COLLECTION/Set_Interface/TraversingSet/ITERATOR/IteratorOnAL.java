package COLLECTION.Set_Interface.TraversingSet.ITERATOR;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorOnAL {
    static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(15);
        myList.add(50);
        myList.add(3);
        myList.add(25);
        myList.add(50);
        myList.add(10);
        System.out.println("Size : "+myList.size());
        Iterator<Integer> it = myList.iterator();
        while (it.hasNext()){
            int x = it.next();
            System.out.println(x);
        }
    }
}
