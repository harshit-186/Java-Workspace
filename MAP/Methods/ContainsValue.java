package MAP.Methods;

import java.util.HashMap;
import java.util.Map;

public class ContainsValue {
    static void main(String[] args) {
        Map<String,Double> myMap = new HashMap<>();
        myMap.put("HEX",80000.0);//null
        myMap.put("DEATH",60000.0);//null
        myMap.put("DEMON",70000.0);//null
        myMap.put("ALBADIE",60000.0);//null
        myMap.put("HEX",90000.0);//80000.0

        System.out.println(myMap.containsValue(90000.0));//true
        System.out.println(myMap.containsValue("20000.0"));//false

        System.out.println("SIZE : " + myMap.size());
    }
}
