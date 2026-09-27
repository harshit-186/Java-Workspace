package COLLECTION.List.ArrayList.Methods.SearchingAL;

import java.util.ArrayList;
import java.util.List;

public class BooleanContains {
    static void main(String[] args) {
        // Collections  method
        List<String> myList = new ArrayList<>();
        myList.add("HEX");
        myList.add("CYPAR");
        myList.add("DEMON");
        myList.add("ALBADIE");
        myList.add("AIRI");
        myList.add("SUPER");
        System.out.println("HEX is in myList ? : "+myList.contains("HEX"));
    }
}
