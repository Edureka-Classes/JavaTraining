package co.edureka.hibernate;

import co.edureka.entity.Student;
import co.edureka.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteStudent {

    public static void main (String[] args) {
        SessionFactory sfactory = HibernateUtils.getSessionFactory();
        Session session = sfactory.openSession();

        session.beginTransaction();

//        //----deleting a student - approach 1:
//        Student st = new Student(101,"Buhari N Maiwada", "buhari@hotmail.com");
//        session.delete(st);

        /* ----deleting a student - approach 2: */
        Student st = session.get(Student.class,102);
        if(st != null){
            System.out.println(st);
            session.delete(st);
        }else {
            System.out.println("----------------- no match student found -----------------");
        }

        session.getTransaction().commit();

        session.close();
        sfactory.close();
    }
}
