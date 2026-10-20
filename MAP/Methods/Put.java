package MAP.Methods;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Put {
    static void main(String[] args) {
        Map<String,Double> myMap = new HashMap<>();
        myMap.put("HEX",80000.0);//null
        myMap.put("DEATH",60000.0);//null
        myMap.put("DEMON",70000.0);//null
        myMap.put("ALBADIE",60000.0);//null
        myMap.put("HEX",90000.0);//80000.0
        System.out.println("DATA of HASHMAP : "+myMap);

        Map<Integer,String> myTree = new TreeMap<>();
        myTree.put(1 , "AROX");
        myTree.put(7 , "YAREYARE");
        myTree.put(9 , "THOR");
        myTree.put(3 , "CYPAR");
        myTree.put(1 , "AIRI");
        System.out.println("DATA of TreeMap : "+myTree);
    }
}
