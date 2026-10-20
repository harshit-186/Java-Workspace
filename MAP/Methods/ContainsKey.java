package MAP.Methods;

import java.util.Map;
import java.util.TreeMap;

public class ContainsKey {
    static void main(String[] args) {
        Map<Integer,String> myTree = new TreeMap<>();
        myTree.put(1 , "AROX");
        myTree.put(7 , "YAREYARE");
        myTree.put(9 , "THOR");
        myTree.put(3 , "CYPAR");
        myTree.put(1 , "AIRI");

//        boolean hex = myTree.containsKey(1);
        System.out.println(myTree.containsKey(7));
        System.out.println("DATA of TreeMap : "+myTree);
    }
}
