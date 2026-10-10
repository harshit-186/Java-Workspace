package COLLECTION.List_Interface.ArrayList.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FruitAcceptRemove {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> myFruit = new ArrayList<>();
        System.out.println("Enter 5 Fruit Names : ");
        for (int i = 0 ; i < 5 ; i++){
            String str = sc.next();
            myFruit.add(str);
        }
        System.out.println("Enter a fruit name which u wants to remove : ");
        String str = sc.next();
        if(myFruit.contains(str)) {
            System.out.println("Removed ? : " + myFruit.remove(str));
            System.out.println("Size : "+ myFruit.size());
        }else{
            System.out.println("Removed ? : false");
            System.out.println("Fruit Not Found!");
        }
    }
}
