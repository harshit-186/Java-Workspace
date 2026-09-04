package Thread_Methods.Join;

public class Even_Odd {
    static void main(String[] args) {
        Even obj = new Even("Child-Thread");
        obj.start();
        try {
            obj.join();
            for (int i = 1; i <= 10; i += 2) {
                System.out.println(Thread.currentThread().getName() +" : "+ i);
            }
        }catch(InterruptedException hex){
            System.out.println(Thread.currentThread() +" interrupted!");
        }
        System.out.println(Thread.currentThread().getName() + " completed!!");
    }
}
