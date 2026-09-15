package RunnableExample;

import MyThreadExample.MyThread;

public class UseMyRunnable {
    static void main(String[] args) {
        MyRunnable hex = new MyRunnable();
        Thread th = new Thread(hex);
        th.start();
        try{
            for (int i = 1 ; i <=10 ; i +=2){
                System.out.println("Main Thread : " +i );
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted !");
        }
        System.out.println("Main Thread Completed !");
    }
}
