package co.edureka.beans;

public class Car {
    private String model;
    private Float cost;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Car [model= " + model + " | cost= " + cost + "]";
    }
}
