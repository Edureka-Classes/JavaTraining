package co.edureka.entity.HQL_ONE2MANYMAPPING;

import javax.persistence.*;

@Entity
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer courseId;
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "fac_Id")
    private Faculty faculty;

    public Batch () {
        super();
    }

    public Batch (String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
    }

    public Integer getCourseId () {
        return this.courseId;
    }

    public void setCourseId (Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName () {
        return this.courseName;
    }

    public void setCourseName (String courseName) {
        this.courseName = courseName;
    }

    public Faculty getFaculty () {
        return this.faculty;
    }

    public void setFaculty (Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString () {
        return "Batch{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", faculty=" + faculty +
                '}';
    }
}
