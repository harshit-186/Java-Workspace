package Thread_Methods;

public class Sleep {
    static void main(String[] args) {
        Thread th = Thread.currentThread();
        System.out.println("Thread details : "+th);
        th.setName("Hex");
        System.out.println("After name changed : "+th);

        try{
            for (int i = 1 ; i<=10 ; i++){
                System.out.println(th.getName() +":"+ i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException ex){
            System.out.println(th.getName()+" interrupted!");
        }

        System.out.println(th.getName()+" completed!");
    }
}
