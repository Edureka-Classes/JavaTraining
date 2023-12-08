package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //-- Initiaalize spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("user-bean.xml");
        System.out.println();
        int noOfBean = context.getBeanDefinitionCount();
        System.out.println("No. of Bean configured= " +noOfBean);
        System.out.println();

        System.out.println("================= BEANS NAMES =================");
        String[] beanNames = context.getBeanDefinitionNames();
        for (String bean : beanNames){
            System.out.println("------> " +bean);
        }

    }
}