package co.edureka.hibernate;

import co.edureka.entity.Student;
import co.edureka.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SearchStudent1 {
    public static void main (String[] args) {
        SessionFactory sfactory = HibernateUtils.getSessionFactory();
        Session session = sfactory.openSession();

        Student st = new Student();

        try{
//            session.load(st, 101);
            //Providing a student ID that's not available
            session.load(st, 1015); // generate exception = ObjectNotFoundException
        }catch (Exception ex){
            System.out.println(ex.toString());
        }

        System.out.println(st);
        session.close();
    }

}
