package RunnableExample;

public class MyThread implements Runnable {
        public void run(){
            try{
                for (int i = 2 ; i <= 10 ; i+=2){
                    System.out.println("Child Thread : "+i);
                    Thread.sleep(500);
                }
            }catch (InterruptedException ex){
                System.out.println("Child Thread interrupted !");
            }
            System.out.println("Child Thread Completed!");
        }
}
