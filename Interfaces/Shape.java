package Interfaces;

    interface Shape {
        default void area() {//wants to change or not its on u
            System.out.print("Area is ");
        }

        String name();//compulsory to override

    static void show() {
        System.out.println("You can't override me");
    }
}
