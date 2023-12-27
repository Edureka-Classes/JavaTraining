package co.edureka.hibernate;

import co.edureka.entity.Student;
import co.edureka.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.List;

public class HQLTest {

    public static void main (String[] args) {
        SessionFactory sfactory = HibernateUtils.getSessionFactory();
        Session session = sfactory.openSession();

        /*
//        String hql = "from co.edureka.entity.Student";

        // getting a student whose name start with a letter
//        String hql = "from co.edureka.entity.Student where studentName LIKE 'F%' ";
        // getting a student by ids
        String hql = "from co.edureka.entity.Student where studentId IN (101,104) ";

        Query<Student> q = session.createQuery(hql, Student.class);
        List<Student> students = q.getResultList();
        printStudent(students);

        */

        /*
        // getting students record using positional  parameters
        String hql = "from co.edureka.entity.Student where studentId between ?1 and ?2 "; //positional parameters


        Query<Student> q = session.createQuery(hql, Student.class);
        q.setParameter(1, 101);
        q.setParameter(2, 104);
        List<Student> students = q.getResultList();
        printStudent(students);

         */

        /*
        // getting students record using named parameters
        String hql = "from co.edureka.entity.Student where studentId between :minsid and :maxsid "; //named parameters


        Query<Student> q = session.createQuery(hql, Student.class);
        q.setParameter("minsid", 101);
        q.setParameter("maxsid", 300);
        List<Student> students = q.getResultList();
        printStudent(students);

         */

        // --------- DML operation(update) with HQL ---------
        String hql = "update co.edureka.entity.Student set studentName= 'Nasir Maiwada', studentEmail='nasir@edureka.com' where studentId='103' ";
        session.beginTransaction();
        Query q = session.createQuery(hql);
        int n = q.executeUpdate();
        System.out.println("Student Updated = " +n);
        session.getTransaction().commit();


        session.close();
        sfactory.close();
    }

    private static void printStudent (List<Student> students) {
        for(Student st : students){
            System.out.println(st);
            try {
                Thread.sleep(1000);
            }catch (Exception exception){
                System.out.println(exception.toString());
            }
        }
    }
}
