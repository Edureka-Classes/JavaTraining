package co.edureka.hibernate;

import co.edureka.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateStudent {
    public static void main (String[] args) {

        // Read data from XML file
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        // Creating session factory (connection with database)
        SessionFactory sfactory = config.buildSessionFactory();
        Session session = sfactory.openSession();

        // Begin Operation
        Transaction tx = session.beginTransaction();

        Student st =  new Student(); //transient state
        st.setStudentId(101);
        st.setStudentName("Buhari");
        st.setStudentEmail("buhari@edureka.com");

        session.save(st); //persistence state

        tx.commit();

        // Close
        session.close();
        sfactory.close();
    }
}
