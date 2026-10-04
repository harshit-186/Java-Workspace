package COLLECTION.List.ArrayList.Exercise;

import java.util.List;
import java.util.Scanner;

public class ListIndex_of {
    static void main(String[] args) {
        List<String> myList = List.of("HEX","CYPAR","DEMON","ALBADIE","DEATH");
        System.out.println("Enter a name of Gamer : ");
        String name = new Scanner(System.in).next();
        int p = myList.indexOf(name);
        if(p==-1){
            System.out.println("Gamer is not Found!");
        }else{
            System.out.println("Rank of Gamer is "+(p+1));
        }
    }
}
