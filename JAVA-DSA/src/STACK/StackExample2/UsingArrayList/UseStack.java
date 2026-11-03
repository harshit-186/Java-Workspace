package STACK.StackExample2.UsingArrayList;

import java.util.Scanner;

public class UseStack {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Stack stack = new Stack();
        int choice,x;
        do{
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Peek Element");
            System.out.println("4. Exit");
            System.out.println("Enter option given above : ");
            choice = sc.nextInt();
            switch (choice){
                case 1-> {
                    try {
                        System.out.println("Enter element to push : ");
                        x = sc.nextInt();
                        stack.push(x);
                        System.out.println("Pushed : " + x + " in Stack");
                    }catch (StackException ex){
                        System.out.println(ex.getMessage());
                    }
                }
                case 2->{
                    try{
                        x=stack.pop();
                        System.out.println("popped element : "+x);
                    }catch (StackException ex){
                        System.out.println(ex.getMessage());
                    }
                }
                case 3->{
                    try{
                        x = stack.peek();
                        System.out.println("Top element is : "+x);
                    }catch (StackException ex){
                        System.out.println(ex.getMessage());
                    }
                }
                case 4-> System.out.println("Thank You!");
                default -> System.out.println("Wrong Choice, Try Again!");
            }
        }while (choice!=4);
    }
}
