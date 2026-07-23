package Interfaces;
class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public String name() {
        return "Circle";
    }

    @Override
    public void area() {
        Shape.super.area();
        System.out.print(Math.PI * Math.pow(radius, 2));
    }
}

