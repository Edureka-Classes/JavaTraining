package co.edureka.entity;

public class Student {
    private Integer studentId;
    private String studentName;
    private String studentEmail;

    public Student () {

    }

    public Student(String name, String email){
        this.studentName = name;
        this.studentEmail= email;
    }

    public Student (Integer studentId, String studentName, String studentEmail) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    public Integer getStudentId () {
        return this.studentId;
    }

    public void setStudentId (Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName () {
        return this.studentName;
    }

    public void setStudentName ( String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail () {
        return this.studentEmail;
    }

    public void setStudentEmail (String studentEmail) {
        this.studentEmail = studentEmail;
    }

    @Override
    public String toString () {
        return String.format("Student [%-3d | %-14s | %s]", studentId, studentName, studentEmail);
    }
}
