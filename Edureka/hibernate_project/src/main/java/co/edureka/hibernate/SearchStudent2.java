package co.edureka.hibernate;

import co.edureka.entity.Student;
import co.edureka.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SearchStudent2 {

    public static void main (String[] args) {
        SessionFactory sfactory = HibernateUtils.getSessionFactory();
        Session session = sfactory.openSession();

//         Student st = session.get(Student.class, 101);
        Student st = session.get(Student.class, 1025);
        System.out.println(st);

        if(st != null){
            System.out.println(st);
        }else {
            System.out.println("----------------- no match student found -----------------");
        }

        System.out.println();
        session.close();
        sfactory.close();
    }
}
