package co.edureka.hibernate.HQL_ONE2MANYMAPPING;

import co.edureka.entity.HQL_ONE2MANYMAPPING.Batch;
import co.edureka.entity.HQL_ONE2MANYMAPPING.Faculty;
import co.edureka.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class One2ManyMapping {

    public static void main (String[] args) {
        SessionFactory sfactory = HibernateUtils.getSessionFactory();
        Session session = sfactory.openSession();
        Transaction tx = session.beginTransaction();

        Faculty faculty = new Faculty();
        faculty.setFacultyId(101);
        faculty.setFacultyName("Java");

        Batch batch1 = new Batch("Java Cerytification", faculty);
        Batch batch2 = new Batch("Spring Certification", faculty);
        Batch batch3 = new Batch("Microservices", faculty);

        Set<Batch> batches = new HashSet<>();
        batches.add(batch1);
        batches.add(batch2);
        batches.add(batch3);

        faculty.setBatches(batches);
        session.save(faculty);

        tx.commit();

        session.close();
        sfactory.close();

    }
}
