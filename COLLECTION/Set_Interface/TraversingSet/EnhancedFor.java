package COLLECTION.Set_Interface.TraversingSet;

import java.util.HashSet;
import java.util.Set;

public class EnhancedFor {
    static void main(String[] args) {
        // Set doest not Allow DUPLICATES
        Set<Integer> mySet = new HashSet<>();
        mySet.add(5);
        mySet.add(15);
        mySet.add(50);
        mySet.add(50);
        mySet.add(3);
        mySet.add(25);
        mySet.add(50);
        mySet.add(10);
        System.out.println("Size : "+mySet.size());
        for(int x : mySet){
            System.out.println(x);
        }
        Set<String> gamerSet = new HashSet<>();
        gamerSet.add("HEX");
        gamerSet.add("CYPAR");
        gamerSet.add("ALBADIE");
        gamerSet.add("DEATH");
        gamerSet.add("DEMON");
        gamerSet.add("ALBADIE");
        gamerSet.add("AGHORI");
        gamerSet.add("ZORO");
        gamerSet.add("AGHORI");

        System.out.println("Size : "+gamerSet.size());
        for(String z : gamerSet){
            System.out.println(z);
        }
    }
}
