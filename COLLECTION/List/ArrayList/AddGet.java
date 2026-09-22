package COLLECTION.List.ArrayList;

import java.util.ArrayList;

public class AddGet {
    static void main(String[] args) {
        ArrayList ref = new ArrayList();//heterogeneous store data which is a drawback in retrieving data
        ref.add("Sachin");
        ref.add(25);
        ref.add(true);
        for (int i = 0 ; i < 3 ; i++) {
            System.out.println(ref.get(i));
        }
    }
}
