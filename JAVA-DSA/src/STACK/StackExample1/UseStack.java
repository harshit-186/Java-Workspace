package STACK.StackExample1;

public class UseStack {
    static void main(String[] args) {
        Stack stack = new Stack(5);
        int x = 10;
        for(int i = 1 ; i <=6 ; i++){
            stack.push(x);
            System.out.println("Pushed : "+x);
            x+=10;
        }
        System.out.println("Top element : "+stack.peek());
        for(int i = 1 ; i <=6 ; i++){
            x =stack.pop();
            System.out.println("Popped element : "+x);
        }
    }
}
