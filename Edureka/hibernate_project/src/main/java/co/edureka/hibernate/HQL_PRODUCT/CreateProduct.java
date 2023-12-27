package co.edureka.hibernate.HQL_PRODUCT;

import co.edureka.entity.HQL_PRODUCT.Product;
import co.edureka.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateProduct {
    public static void main (String[] args) {

        // Read data from XML file
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        // Creating session factory (connection with database)
        SessionFactory sfactory = config.buildSessionFactory();
        Session session = sfactory.openSession();

        // Begin Operation
        Transaction tx = session.beginTransaction();

        Product prod = new Product(); //transient state
        prod.setProductId(1001L);
        prod.setProductName("Mobile Phone");
        prod.setProductPrice(72500.76f);

        session.save(prod); //persistence state

        tx.commit();

        // Close
        session.close();
        sfactory.close();
    }
}
