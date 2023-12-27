package co.edureka;

import co.edureka.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //-- Initiaalize spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("user-bean.xml");
        System.out.println();

        User usr1 = (User) context.getBean("user1");
        System.out.println();
        System.out.println(usr1);
        System.out.println();

        User usr2 = (User) context.getBean("user2");
        System.out.println(usr2);
        System.out.println();

    }
}