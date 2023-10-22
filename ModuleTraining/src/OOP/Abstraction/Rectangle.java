package OOP.Abstraction;

public class Rectangle extends Shape{
    int length, breath;

    public Rectangle(String color, int length, int breath){
        super(color);
        this.length = length;
        this.breath = breath;
    }


    @Override
    void area() {

        System.out.println("Area of Rectangle = " + (this.length * this.breath));
    }
}
