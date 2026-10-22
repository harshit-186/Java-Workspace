package MAP.Methods;

import java.util.HashMap;
import java.util.Map;

public class IsEmpty {
    public static void main(String[]args){
        Map<String,Double> myMap = new HashMap<>();
        myMap.put("HEX",80000.0);//null
        myMap.put("DEATH",60000.0);//null
        myMap.put("DEMON",70000.0);//null
        myMap.put("ALBADIE",60000.0);//null
        myMap.put("HEX",90000.0);//80000.0

        System.out.println("SIZE : " + myMap.size());
        System.out.println("Is Empty the Map : "+ myMap.isEmpty());
        System.out.println("SIZE : " + myMap.size());
        System.out.println("DATA of HASHMAP : "+myMap);
        myMap.clear();
        System.out.println("Is Empty the Map : "+ myMap.isEmpty());

    }
}
