package co.edureka.beans;

public class Customer {
    private String customerName;
    private Car car;

    public Customer() {
        super();
    }

    public Customer(String customerName, Car car) {
        super();
        this.customerName = customerName;
        this.car = car;
    }

    public String getCustomerName() {
        return customerName;
    }

//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Customer [customerName= " + customerName + " | car= " + car + "]";
    }
}
