package COLLECTION.List.ArrayList.Methods;

import java.util.ArrayList;
import java.util.List;

public class ArrListGet {
    static void main(String[] args) {
        //object get (int)
        List<String> ref ;
        ref = new ArrayList<>();
        ref.addLast("HEX");
        ref.add("CYPAR");
        ref.add("AIRI");
        ref.add("AVI");
        ref.addLast("Demon");
        ref.add("Death");
        ref.addFirst("Albadie");

        String str = ref.getFirst();
        System.out.println("First Value : " + str);
        str = ref.getLast();
        System.out.println("Last Value : " + str);
        str = ref.get(5);
        System.out.println("Value : " + str);
        str = ref.get(1);
        System.out.println("Value : "+str);

    }
}
