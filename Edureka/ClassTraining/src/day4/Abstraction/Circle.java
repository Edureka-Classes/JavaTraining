package day4.Abstraction;

public class Circle extends Shape {
    float radius;

    public Circle (String color, float radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void area () {
        System.out.printf("Area of Circle = %.2f\n", (Math.PI * radius * radius));
    }
}
