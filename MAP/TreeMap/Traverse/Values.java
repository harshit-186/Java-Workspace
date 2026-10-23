package MAP.TreeMap.Traverse;

import java.util.*;

public class Values {
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
        }
            double total = 0;
            Collection<Double> itemPrice = shopCart.values();
            for(Double price : itemPrice){
                total +=price;
            }
            System.out.println("The Total Bill is : "+total);

    }
}
