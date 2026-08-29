package Thread_Methods;

public class GetName {
    static void main(String[] args) {
        Thread th = Thread.currentThread();
        System.out.println("Thread details : "+th);
        th.setName("Hex");
        System.out.println("After name changed : "+th);
        //public String getName()
        System.out.println(th.getName());
    }
}
