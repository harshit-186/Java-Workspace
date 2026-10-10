package COLLECTION.List_Interface.ArrayList.CustomArrayList.Comparable;

public class CompareToAge implements Comparable<CompareToAge>{
    private int age;

    public CompareToAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                '}';
    }

    public int compareTo(CompareToAge o ){
        return this.age-o.age;
    }
}
