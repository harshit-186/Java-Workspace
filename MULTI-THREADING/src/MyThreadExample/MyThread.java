package MyThreadExample;

public class MyThread extends Thread{
    static void main(String[] args) {
        public MyThread(String name ){
            super(name);
        }
        public void run(){
            try{
                for (int i = 2 ; i<=10 ; i++){
                    System.out.println(super.getName()+ " : "+i);
                    Thread.sleep(500);
                }
            }catch(InterruptedException ex){
                System.out.println(super.getName()+ " : "+"interrupted!");
            }

            System.out.println(super.getName()+" : "+"completed!");
        }

    }
}
