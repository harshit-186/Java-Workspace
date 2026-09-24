package COLLECTION.List.ListChild;

import java.util.*;

public class ObjOfListChild {
    static void main(String[] args) {
        List<Integer> ref ;// Loosely Coupling best in programing (Parent ka ref and object child ka)
        // in loosely coupled the only parent class methods are access able which are in child class
        ref = new ArrayList<>();
        ref = new LinkedList<>();
        ref = new Vector<>();
        ref = new Stack<>();

    }
}
