package COLLECTION.List_Interface.ArrayList.Methods.SearchingAL;

import java.util.ArrayList;
import java.util.List;

public class IntIndexOf {
    static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("HEX");
        myList.add("CYPAR");
        myList.add("DEMON");
        myList.add("ALBADIE");
        myList.add("AIRI");
        myList.add("SUPER");
        System.out.println("What is the INDEX of DEMON ? : " + myList.indexOf("DEMON"));
    }
}
