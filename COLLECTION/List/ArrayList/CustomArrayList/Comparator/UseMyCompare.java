package COLLECTION.List.ArrayList.CustomArrayList.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseMyCompare {
    static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(List.of(30,20,10,90,70,50));
        System.out.println("Before Sorting : "+myList);
        Collections.sort(myList,new MyCompare());//Anynomous Object
        System.out.println("After Sorting : "+myList);
    }
}
