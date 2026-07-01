package Static_Methods;
class Student{
    public Student(){
        System.out.println("Constructor called...");
    }
    public static void show(){
        System.out.println("Hey!, Hi Stranger");
    }
    static {
        System.out.println("Static block called...");
    }
}
public class UseStudent {
    static void main() {

         Student.show();
        Student s1=new Student();
        Student s2=new Student();
//        Student s3=new Student();
    }
}
