package Thread_Methods.Join;

public class Even extends Thread{
    public void run() {
        try {
            for (int i = 0; i <= 10; i += 2) {
                System.out.println(Thread.currentThread().getName() + i);
                Thread.sleep(500);
            }
        }catch(InterruptedException hex){
            System.out.println(Thread.currentThread() +"interrupted!");
        }
        System.out.println(Thread.currentThread().getName() + "completed!!");
    }

}
