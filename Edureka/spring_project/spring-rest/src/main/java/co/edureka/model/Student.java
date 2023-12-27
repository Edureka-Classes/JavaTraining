package co.edureka.model;

public class Student {
    private String studentName;
    private Integer studentAge;
    private String studentAddress;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student[" +
                "studentName= " + studentName + "| studentAge= " + studentAge +
                " | studentAddress= " + studentAddress + "]";
    }
}
