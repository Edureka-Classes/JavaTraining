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

        User usr2 = (User) context.getBean("user1");
        System.out.println(usr2);
        System.out.println();

        User usr3 = (User) context.getBean("user1");
        System.out.println(usr3);
        System.out.println();

        System.out.println(usr1.hashCode() + " | " + usr2.hashCode() + " | " + usr3.hashCode());
        System.out.println();

        // NOT recommended use the typecasting one
        User usr4 = context.getBean("user2", User.class);
        System.out.println(usr4);
    }
}