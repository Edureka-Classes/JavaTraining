package co.edureka.entity.HQL_ONE2ONEMAPPING;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    private Integer employeeId;
    private String employeeName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addr_id")
    private Address address;

    public Employee () {
    }

    public Employee (final String employeeName, final Address address) {
        this.employeeName = employeeName;
        this.address = address;
    }

    public Integer getEmployeeId () {
        return this.employeeId;
    }

    public void setEmployeeId (final Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName () {
        return this.employeeName;
    }

    public void setEmployeeName (final String employeeName) {
        this.employeeName = employeeName;
    }

    public Address getAddress () {
        return this.address;
    }

    public void setAddress (final Address address) {
        this.address = address;
    }

    @Override
    public String toString () {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", address=" + address +
                '}';
    }
}
