package MAP.TreeMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Entry {
    static void main(String[] args) {

        //Map store values in Key_Value pairs
        Map<Integer,String> myMap = new TreeMap<>();
        //MAP has no Iterator interface
        myMap.put(10,"Ketan");
        myMap.put(15,"Amit");
        myMap.put(1,"Ankit");
        myMap.put(20,"Sumit");
        System.out.println("Size : "+myMap.size());
        System.out.println(myMap);
    }
}
