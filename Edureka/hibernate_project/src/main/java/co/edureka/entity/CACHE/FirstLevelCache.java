package co.edureka.entity.CACHE;

import co.edureka.entity.Student;
import co.edureka.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class FirstLevelCache {

    // first level cache is associated with the session
    public static void main (String[] args) {
        SessionFactory sf = HibernateUtils.getSessionFactory();
        Session session = sf.openSession();

        Student st1 = session.get(Student.class, 101);
        System.out.println(st1);
        System.out.println();

        try{
            Thread.sleep(4000);
        }catch (Exception ex){
            System.out.println(ex.toString());
        }

        Student st2 = session.get(Student.class, 101);
        System.out.println(st2);
        System.out.println();

        session.close();
        sf.close();

    }
}
