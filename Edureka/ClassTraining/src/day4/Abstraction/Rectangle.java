package day4.Abstraction;

public class Rectangle extends Shape{
    int length, breath;

    public Rectangle (String color, int length, int breath) {
        super(color);
        this.length = length;
        this.breath = breath;
    }


    @Override
    public void area () {
        System.out.println("Area of Rectangle = " +(length * breath) );
    }
}
