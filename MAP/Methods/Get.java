package MAP.Methods;

import java.util.HashMap;
import java.util.Map;

public class Get {
    static void main(String[] args) {
        Map<String,Double> myMap = new HashMap<>();
        myMap.put("HEX",80000.0);//null
        myMap.put("DEATH",60000.0);//null
        myMap.put("DEMON",70000.0);//null
        myMap.put("ALBADIE",60000.0);//null
        System.out.println(myMap.put("HEX",90000.0));//80000.0

        System.out.println(myMap.get("HEX"));//90000.0
        System.out.println(myMap.get("AIRI"));//null

        System.out.println("DATA of HASHMAP : "+myMap);

    }
}
