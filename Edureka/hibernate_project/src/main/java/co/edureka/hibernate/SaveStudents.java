package co.edureka.hibernate;

import co.edureka.entity.Student;
import co.edureka.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SaveStudents {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        SessionFactory sfactory = HibernateUtils.getSessionFactory();
        Session session = sfactory.openSession();
        Transaction tx = session.beginTransaction();

        String req = "Y";

        do {
            System.out.print("Enter student name & email: ");
            String name = sc.next();
            String email = sc.next();

            Student st = new Student(name, email);
            // session.save(st);
            // providing a serial IDs in the Database
            Serializable sid = session.save(st);
            System.out.print("Student with student id: " + sid + " saved...");

            System.out.print("\nDo you want to save more students[Y/N]: ");
            req = sc.next();
        }while (req.equalsIgnoreCase("Y"));

        System.out.println();

        tx.commit();

        session.close();
        sfactory.close();
    }
}
