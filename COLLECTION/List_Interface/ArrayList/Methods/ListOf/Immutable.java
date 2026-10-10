package COLLECTION.List_Interface.ArrayList.Methods.ListOf;

import java.util.List;
import java.util.Scanner;

public class Immutable {
    static void main(String[] args) {
        List<String> gamerist = List.of("DEMON" , "HEX" , "ALBADIE" , "CYPAR" , "AIRI");
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
        gamerist.add("DEATH");//Exception
    }
}
