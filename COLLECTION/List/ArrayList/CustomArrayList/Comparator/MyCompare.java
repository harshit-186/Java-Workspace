package COLLECTION.List.ArrayList.CustomArrayList.Comparator;

import java.util.Comparator;

public class MyCompare implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
