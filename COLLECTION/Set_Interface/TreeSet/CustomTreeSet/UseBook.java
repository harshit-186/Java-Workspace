package COLLECTION.Set_Interface.TreeSet.CustomTreeSet;

import java.util.Set;
import java.util.TreeSet;

public class UseBook {
    static void main(String[] args) {
        Set<Book> myBook = new TreeSet<>();
        Book b1 = new Book("JAVA MASTER", "JVM" , 600);
        Book b2 = new Book("MACHINE LEARNING", "SHARMA" , 800);
        Book b3 = new Book("AI", "HEX" , 900);
        Book b4 = new Book("DEEP LEARNING", "AKLKA" , 500);
        myBook.add(b1);
        myBook.add(b2);
        myBook.add(b3);
        myBook.add(b4);
        System.out.println("SORTED on the basis of Price : ");
//        System.out.println(myBook);
        for (Book str : myBook){
            System.out.println(str);
        }
    }
}
