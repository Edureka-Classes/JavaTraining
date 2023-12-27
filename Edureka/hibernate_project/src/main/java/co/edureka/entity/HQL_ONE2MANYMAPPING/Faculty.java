package co.edureka.entity.HQL_ONE2MANYMAPPING;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Faculty {

    @Id
    @Column
    private Integer facultyId;

    @Column
    private String facultyName;

    @OneToMany(mappedBy = "faculty", cascade = CascadeType.ALL)
    private Set<Batch> batches;

    public Faculty () {
        super();
    }

    public Integer getFacultyId () {
        return this.facultyId;
    }

    public void setFacultyId (final Integer facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName () {
        return this.facultyName;
    }

    public void setFacultyName (final String facultyName) {
        this.facultyName = facultyName;
    }

    public Set<Batch> getBatches () {
        return this.batches;
    }

    public void setBatches (final Set<Batch> batches) {
        this.batches = batches;
    }

    @Override
    public String toString () {
        return "Faculty{" +
                "facultyId=" + facultyId +
                ", facultyName='" + facultyName + '\'' +
                ", batches=" + batches +
                '}';
    }

}
