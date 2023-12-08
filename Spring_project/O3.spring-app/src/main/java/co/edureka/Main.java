package co.edureka;

import co.edureka.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //-- Initiaalize spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("user-bean.xml");
        System.out.println();

        //-- LifeCycle methods
        ((ConfigurableApplicationContext)context).close();


    }
}