package co.edureka;

import co.edureka.beans.Customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //-- Initiaalize spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("customer-car-beans.xml");

        Customer Buhari = (Customer)context.getBean("Buhari");
        System.out.printf("%s owns a %s car, which costs $%.2f ", Buhari.getCustomerName(), Buhari.getCar().getModel(), Buhari.getCar().getCost());
        System.out.println();
    }
}