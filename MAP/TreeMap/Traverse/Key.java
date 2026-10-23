package MAP.TreeMap.Traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Key {
    static void main(String[] args) {
        Map<String, Double> shopCart = new TreeMap<>();
        shopCart.put("Laptop", 60000.0);
        shopCart.put("Desktop", 50000.0);
        shopCart.put("Iphone", 80000.0);
        shopCart.put("SamsungUltra", 85000.0);
        shopCart.put("Laptop", 90000.0);

        Set<String> itemNames = shopCart.keySet();
        System.out.println("The items are : ");
        for (String items : itemNames) {
            System.out.println(items);
            // output Sorted hoga
        }
    }
}
