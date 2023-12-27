package day4.Abstraction;

abstract public class Shape {
    String color;

    public Shape (String color) {
        this.color = color;
    }

    public String getColor () {
        return this.color;
    }

    public void setColor (String color) {
        this.color = color;
    }

    abstract public void area();
}
