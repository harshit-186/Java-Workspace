package Thread_Methods;

public class SetName {
    static void main(String[] args) {
        Thread th = Thread.currentThread();
        System.out.println("Thread details : "+th);
        th.setName("Hex");
        System.out.println("Thread details : "+th);

    }
}
