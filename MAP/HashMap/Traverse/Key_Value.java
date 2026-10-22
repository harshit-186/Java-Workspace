package MAP.HashMap.Traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Key_Value {
    static void main(String[] args) {
        Map<String, Double> shopCart = new HashMap<>();
        shopCart.put("Laptop", 60000.0);
        shopCart.put("Desktop", 50000.0);
        shopCart.put("Iphone", 80000.0);
        shopCart.put("SamsungUltra", 85000.0);
        shopCart.put("Laptop", 90000.0);

        double bill = 0;
        Set<Map.Entry<String,Double>> items = shopCart.entrySet();
        for (Map.Entry<String,Double> i : items){
            System.out.println("Item is : "+ i.getKey()+ " , Price is : "+i.getValue());
            bill += i.getValue();
        }
        System.out.println("Total Bill is : "+bill);
    }
}
