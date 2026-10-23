package MAP.TreeMap.Custom;

public class Student {
    private int roll ;
    private String name ;
    private double per ;

    public Student(String name, int roll, double per) {
        this.name = name;
        this.roll = roll;
        this.per = per;
    }

    public int getRoll() {
        return roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", per=" + per +
                '}';
    }
}
