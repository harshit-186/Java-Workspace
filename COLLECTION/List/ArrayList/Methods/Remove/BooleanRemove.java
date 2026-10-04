package COLLECTION.List.ArrayList.Methods.Remove;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BooleanRemove {
    static void main(String[] args) {
        //Collection Method
        List<String> myList = new ArrayList<>(List.of("HEX","CYPAR","DEMON","ALBADIE","DEATH"));
        System.out.print("Enter name of Gamer : ");
        String name = new Scanner(System.in).next().toUpperCase();
        int p = myList.indexOf(name);
        if(p==-1){
            System.out.println("Gamer is not Found!");
        } else if (p==4 || p == 5) {
            System.out.println("NOOB are Not in a Category of Gamers!");
        } else{
            System.out.println("Rank of Gamer is "+(p+1));
        }
        System.out.println("Before Gamer List : "+myList);
        System.out.println("NOOBS are Removed ? "+ myList.remove("DEATH"));
        System.out.println("After Removing noob from list of Gamers : "+myList);
        System.out.println("Size of List is : "+myList.size());
    }
}
