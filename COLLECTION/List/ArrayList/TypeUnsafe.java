package COLLECTION.List.ArrayList;

import java.util.ArrayList;

public class TypeUnsafe {
    static void main(String[] args) {
        ArrayList ref = new ArrayList();//heterogeneous store data which is a drawback in retrieving data
        ref.add("Sachin");
        ref.add(25);
        ref.add(true);
        //int n = ref.get(1); // Syntax error
        int a = (Integer)ref.get(1);//explicit conversion by using wrapper classes
        for (int i = 0 ; i < 3 ; i++) {
            System.out.println(ref.get(i));
        }
    }
}
