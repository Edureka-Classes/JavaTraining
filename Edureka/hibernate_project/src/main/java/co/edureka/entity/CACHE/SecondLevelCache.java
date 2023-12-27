package co.edureka.entity.CACHE;

import co.edureka.entity.Student;
import co.edureka.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SecondLevelCache {

    // Second level cache is associated with sessionFactory
    public static void main (String[] args) {
        SessionFactory sf = HibernateUtils.getSessionFactory();
        Session session1 = sf.openSession();
        Session session2 = sf.openSession();

        Student st1 = session1.get(Student.class, 101);
        System.out.println(st1);
        System.out.println();

        try{
            Thread.sleep(4000);
        }catch (Exception e){
            System.out.println(e.toString());
        }

        Student st2 = session2.get(Student.class, 101);
        System.out.println(st2);
        System.out.println();


        session1.close();
        session2.close();
        sf.close();
    }
}
