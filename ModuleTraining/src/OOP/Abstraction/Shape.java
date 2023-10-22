package OOP.Abstraction;

abstract class Shape {

    String color;

    public Shape(String color){
        super();
        this.color = color;
    }

    abstract void area();

    public String getColor() {
        return this.color;
    }

    public void setColor(final String color) {
        this.color = color;
    }


}
