package COLLECTION.List.ArrayList.Methods;

import java.util.ArrayList;
import java.util.List;

public class VoidAdd {
    static void main(String[] args) {
        List<Integer> ref ;
        ref = new ArrayList<>();
        ref.add(0,20);
        ref.add(1,30);
        ref.add(1,50);
        ref.add(0,80);
        System.out.println(ref);
    }
}
