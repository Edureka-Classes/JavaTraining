package co.edureka.hibernate.HQL_EMPLOYEE;

import co.edureka.entity.HQL_EMPLOYEE.Address;
import co.edureka.entity.HQL_EMPLOYEE.Employee;
import co.edureka.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class One2OneMapping {

    public static void main (String[] args) {

        SessionFactory sfactory = HibernateUtils.getSessionFactory();
        Session session = sfactory.openSession();
        Transaction tx = session.beginTransaction();

        Employee emp = new Employee();
        emp.setEmployeeId(101);
        emp.setEmployeeName("Buhari Maiwada");

        Address addr = new Address("Martins CT", "Lanham", "MD");
        emp.setAddress(addr);
        session.save(emp);

        tx.commit();

        session.close();
        sfactory.close();
    }

}
