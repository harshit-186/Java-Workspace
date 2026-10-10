package COLLECTION.List_Interface.ArrayList.Methods;

import java.util.ArrayList;
import java.util.List;

public class MyListSize {
    static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("HEX");
        myList.add("CYPAR");
        myList.add("DEMON");
        myList.add("ALBADIE");
        myList.add("AIRI");
        myList.add("SUPER");
//        size() is Collections method
        System.out.println("The size of myList is : "+myList.size());
//        System.out.println(myList);
        for(String x : myList){
            System.out.println("Gamer : " + x);
        }
    }
}
