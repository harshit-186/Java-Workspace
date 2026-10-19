package MAP;

import java.util.HashMap;
import java.util.Map;

public class Key_Value {
    static void main(String[] args) {
        Map<Integer,String> myMap = new HashMap<>();
        //MAP has no Iterator interface
        myMap.put(10,"Ketan");
        myMap.put(15,"Amit");
        myMap.put(1,"Ankit");
        myMap.put(20,"Sumit");
        System.out.println("Size : "+myMap.size());
        System.out.println(myMap);
    }
}
