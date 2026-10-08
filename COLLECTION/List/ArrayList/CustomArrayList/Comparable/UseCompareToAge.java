package COLLECTION.List.ArrayList.CustomArrayList.Comparable;

import COLLECTION.List.ArrayList.CustomArrayList.Emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCompareToAge {
    static void main(String[] args) {
        List<CompareToAge> myList = new ArrayList<>();
        CompareToAge  e1 = new CompareToAge(22);
        CompareToAge e2 = new CompareToAge(21);
        CompareToAge e3 = new CompareToAge(19);
        CompareToAge  e4 = new CompareToAge(20);
        CompareToAge   e5 = new CompareToAge(24);

        myList.add(e1);
        myList.add(e2);
        myList.add(e3);
        myList.add(e4);
        myList.add(e5);
        System.out.println("Before Sorting : "+myList);
        Collections.sort(myList);
        System.out.println("After Sorting : "+myList);

        // All Pre-Defined classes overrides compareTo()
        List <Integer> ist = new ArrayList<>(List.of(40,90,50,10,60));
        Collections.sort(ist);
        System.out.println(ist);
    }
}
