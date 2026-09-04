package MyThreadExample;

public class Example1 {
    static void main(String[] args) {

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + i);

                Thread.sleep(1000);
            }
        } catch (InterruptedException hex) {
            System.out.println("main-thread interrupted!");
        }
    }
}
