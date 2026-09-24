package COLLECTION.List.ArrayList.Methods;

import java.util.ArrayList;
import java.util.List;

public class BooleanAdd {
    static void main(String[] args) {
        List<Integer> myList ;
        myList = new ArrayList<>();
        myList.add(30);
        // Collection method
        myList.add(90);
        myList.add(50);
        myList.add(70);
        myList.add(50); // Duplicates allows in ArrayList
        myList.add(20);
        System.out.println(myList); // OverRiding of toString() by List

    }
}
