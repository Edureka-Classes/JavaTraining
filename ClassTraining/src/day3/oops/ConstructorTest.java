package day3.oops;

class Employee2 {
    int empno;
    String name;
    float salary;

    Employee2(){

    }
    Employee2(int empno, String name){
        this.empno = empno;
        this.name = name;
    }
    Employee2(int a, String b, float c){
        this(a,b); // constructor chaining
       /*
        this.empno = a;
        this.name = b;
      */
        this.salary = c;
    }


    void getDetails() {
        System.out.println(this.empno + " | " + this.name + " | " + " | " + this.salary);

    }

}

public class ConstructorTest {
    public static void main(String[] args) {

        // -- create an instance/object of Employee type
        Employee2 emp1 = new Employee2();
        Employee2 emp2 = new Employee2(101, "Buhari");
        Employee2 emp3 = new Employee2(102, "Nasir", 45000.00f);

        emp1.getDetails();
        emp2.getDetails();
        emp3.getDetails();

    }
}
