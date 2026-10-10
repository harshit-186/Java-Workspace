package COLLECTION.List_Interface.ArrayList.Methods.Remove;

import java.util.ArrayList;
import java.util.List;

public class ObjectRemoveInt {
    static void main(String[] args) {
        // Arraylist Mehthod
        List<String> myList = new ArrayList<>(List.of("HEX","CYPAR","DEMON","ALBADIE","DEATH"));
        System.out.println("List size : "+myList.size());
        System.out.println(myList);
        int index = myList.indexOf("DEATH");
        System.out.println("Removing element at index : "+index + " , "+myList.remove(index));
        System.out.println("List Size : "+myList.size());
        System.out.println(myList);
    }
}
