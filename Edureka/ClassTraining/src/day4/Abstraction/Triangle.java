package day4.Abstraction;

public class Triangle extends Shape{
    int base, height;

    public Triangle(String color, int base, int height){
        super(color);
        this.base = base;
        this.height = height;
    };

    @Override
    public void area () {
        System.out.printf("Area of Triangle = %.2f", (0.5 * base * height));
    }
}
