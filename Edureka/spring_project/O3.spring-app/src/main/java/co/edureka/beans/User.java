package co.edureka.beans;

public class User {
    private String firstName;
    private String lastName;

    public User() {
        super();
        System.out.println("no argument constructor");
    }

    public User(String firstName, String lastName) {
        super();
        System.out.println("two argument constructor");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        System.out.println("inside getFirstName()");
        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("inside setFirstName()");
        this.firstName = firstName;
    }

    public String getLastName() {
        System.out.println("inside getLastName()");
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println("inside setLastName()");
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User [firstName= " + firstName + " | lastName= " + lastName  +
                ']';
    }

    //-- LifeCycle methods
    public void myInit1(){
        System.out.println("user-defined initialization - 1");
    }

    public void myInit2(){
        System.out.println("user-defined initialization - 2");
    }

    public void myDestructor(){
        System.out.println("user-defined destructor");
    }

}

