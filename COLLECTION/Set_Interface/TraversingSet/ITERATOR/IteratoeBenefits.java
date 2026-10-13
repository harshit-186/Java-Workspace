package COLLECTION.Set_Interface.TraversingSet.ITERATOR;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratoeBenefits {
    static void main(String[] args) {
        List<String> gamerList = new ArrayList<>();

        gamerList.add("HEX");
        gamerList.add("ALBADIE");
        gamerList.add("DEATH");
        gamerList.add("CYPAR");
        gamerList.add("DEMON");
        gamerList.add("AIRI");

        Iterator<String> it = gamerList.iterator();
        while(it.hasNext()){
            String str = it.next();
            if(str.startsWith("A")){
                it.remove();
            }else {
                System.out.println(str);
            }
        }
        System.out.println(gamerList.size());
    }
}
