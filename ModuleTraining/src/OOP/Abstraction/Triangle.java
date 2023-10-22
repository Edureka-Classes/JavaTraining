package OOP.Abstraction;

public class Triangle extends Shape {
    int base, height;

    public Triangle(String color, int base, int height ){
        super(color);
        this.base = base;
        this.height = height;
    }


    @Override
    void area() {

        System.out.println("Area of Rectangle = " + 0.5f * (this.base * this.height));
    }
}
