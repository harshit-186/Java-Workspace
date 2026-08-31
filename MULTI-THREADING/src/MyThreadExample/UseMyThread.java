package MyThreadExample;

public class UseMyThread {
    static void main(String[] args) {
        MyThread m = new MyThread("Child-Thread");
        System.out.println(m);
        m.start();
        try{
            for (int i = 1 ; i <=10 ; i+=2){
                System.out.println("main-thread : "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("main-thread interrupted!");
        }
        System.out.println("main-thread completed!");
    }
}
