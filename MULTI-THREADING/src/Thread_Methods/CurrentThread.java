package Thread_Methods;

public class CurrentThread {
    static void main(String[] args) {
//        public static Thread currentThread()
        Thread th = Thread.currentThread();//static method of Thread
        System.out.println("Thread Details : "+th);// id, name, priority, group
        System.out.println("Hello User");
    }
}
