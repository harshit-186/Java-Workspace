package COLLECTION.List_Interface.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class MyLiinkedList {
    static void main(String[] args) {
        //LinkedList is best for Manupulation or updation
        List<Integer> myList = new LinkedList<>(List.of(20,40,50,10,80,40,90));
        System.out.println(myList);
        System.out.println("Traversing on LinkedList : ");
        for(Integer x : myList){
            System.out.println(x);
        }
    }
}
