package COLLECTION.List_Interface.ArrayList.Methods.ListOf;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mutable {
    static void main(String[] args) {
        // now it is mutable after giving it into AL constructor (it makes any List into mutable list)
            List<String> gamerist = new ArrayList<>(List.of("DEMON" , "HEX" , "ALBADIE" , "CYPAR" , "AIRI"));
            System.out.println("Enter Gamer Name : ");
            //Strings are case sensitive
            String str = new Scanner(System.in).next().toUpperCase();
            int x = gamerist.indexOf(str);
            if(x==-1){
                System.out.println("Gamer NOT Found");
            }
            else{
                System.out.println("Rank is "+(x+1));
            }
        System.out.println("Size : "+gamerist.size());
        System.out.println(gamerist);
        System.out.println("New Gamer is Added!");
            gamerist.add("DEATH");
        System.out.println("Size : "+gamerist.size());
        System.out.println(gamerist);
    }
}
