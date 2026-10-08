package COLLECTION.List.ArrayList.CustomArrayList.Comparable;

public class CompareToAge implements Comparable<CompareToAge>{
    private int age;
    public int compareTo(CompareToAge o ){
        return this.age-o.age;
    }
}
