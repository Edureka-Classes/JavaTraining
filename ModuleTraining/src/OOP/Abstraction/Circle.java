package OOP.Abstraction;

public class Circle extends Shape{
    float radius;

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    void area() {

        System.out.printf("Area of Rectangle = %.2f", (Math.PI * Math.pow(radius, 2)));

    }
}
