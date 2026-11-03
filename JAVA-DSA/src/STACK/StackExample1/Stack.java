package STACK.StackExample1;

public class Stack {
    private int [] arr ;
    private int size ;
    private int tos;
    public Stack (int size){
        this.size=size;
        tos = -1;
        arr = new int[size];
    }
    public void push(int x){
        if(tos==size-1){
            System.out.println("Stack Overflow");
            return;
        }
        tos++;
        arr[tos]= x;
        // arr[++tos]=x;
    }
    public int pop(){
        if(tos==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        int x = arr[tos];
        tos--;
        return x;
        //return arr[tos--];
    }
    public int peek(){
        if(tos==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[tos];
    }
}
