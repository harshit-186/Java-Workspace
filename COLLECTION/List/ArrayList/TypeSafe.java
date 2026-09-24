package COLLECTION.List.ArrayList;

import java.util.ArrayList;

public class TypeSafe {
    static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        names.add("Sachin");
        // names.add(100); //Syntax Error
        marks.add(80);
//        marks.add("Amit"); // Syntax Error

        String str = names.get(0); // no need of Explicit conversion
    }
}
