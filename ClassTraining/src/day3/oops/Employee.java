package day3.oops;

public class Employee {
    int empno;
    String name;
    float salary;

    void setDetails() {
        name = "Buhari Maiwada";
        salary = 5000.75f;
    }

    void getDetails() {
        System.out.println(empno + " | " + name + " | " + " | " + salary);

    }

}

class ObjectTest{
    public static void main(String[] args) {

        // -- create an instance/object of Employee type
        Employee emp = new Employee();

        // -- access the state of an instance using reference
        System.out.println(emp.empno + " | " + emp.name + " | " + emp.salary);

        // -- access the state of an instance using reference & method
        emp.getDetails();

        // -- change the state of object using reference
        emp.empno = 102;
        emp.name = "Bsoft";
        emp.salary = 2000.00f;
        emp.getDetails();

       // -- change the state of object using reference & method
        emp.setDetails();
        emp.getDetails();
    }
}
