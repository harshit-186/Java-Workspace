package StackExample.UsingArray;

public class Stack {
    private int [] arr ;
    private int size ;
    private int tos;
    public Stack(int size){
        this.size=size;
        tos = -1;
        arr = new int[size];
    }
    public void push(int x){
        if(tos==size-1){
            StackException ex = new StackException("Stack Overflow");
            throw ex;
//            System.out.println("Stack Overflow");
        }
         arr[++tos]=x;
    }
    public int pop(){
        if(tos==-1){
            StackException ex = new StackException("Stack Underflow");
            throw ex;
        }
        return arr[tos--];
    }
    public int peek(){
        if(tos==-1){
            StackException ex = new StackException("Stack Underflow");
            throw ex;
        }
        return arr[tos];
    }
}
