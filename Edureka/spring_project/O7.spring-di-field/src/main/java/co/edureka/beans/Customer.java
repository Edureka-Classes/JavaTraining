package co.edureka.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
    private String customerName;

    @Autowired
    private Car car;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Car getCar() {
        return car;
    }

    //removed setter()
//    public void setCar(Car car) {
//        this.car = car;
//    }

}
