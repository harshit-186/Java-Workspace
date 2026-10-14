package COLLECTION.Set_Interface.HashSet;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet {
    static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        String s1 = new String("HEX");
        mySet.add(s1);
        String s2 = new String("YAREYARE");
        mySet.add(s2);
        String s3 = new String("HEX");
        mySet.add(s3);// String Class Overrides the hashCode() and equals() then it checks no same objects inserted
        System.out.println("Size : "+mySet.size());
        System.out.println(mySet);//random output due to hashing
        for(String str : mySet){
            System.out.println(str);
        }
        System.out.println("s1 hashcode : "+s1.hashCode());
        System.out.println("s2 hashcode : "+s2.hashCode());
        System.out.println("s3 hashcode : "+s3.hashCode());

        String s4 = new String("FB");
        String s5 = new String("Ea");
        System.out.println("s4 hashCode : "+s4.hashCode());// Same hashCode
        System.out.println("s5 hashCode : "+s5.hashCode());// Same hashCode
        mySet.add(s4);
        mySet.add(s5);
        System.out.println(mySet);

    }
}
