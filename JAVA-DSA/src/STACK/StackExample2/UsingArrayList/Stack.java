package STACK.StackExample2.UsingArrayList;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> list ;
    private int tos;
    public Stack (){
        tos = -1;
        list=new ArrayList<>();
    }
    public void push(int x){
        tos++;
        list.add(x);
    }
    public int pop(){
        if(tos==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        int x = list.get(tos);
        tos--;
        return x;
        //return arr[tos--];
    }
    public int peek(){
        if(tos==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return list.get(tos);
    }
}
