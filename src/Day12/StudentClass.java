package Day12;

import java.util.Collection;

public class StudentClass {

    private Integer classId;

    private Integer studentCount;

    private Collection collectionStudent;

    public StudentClass(Integer classId, Integer studentCount, Collection collectionStudent) {
        this.classId = classId;
        this.studentCount = studentCount;
        this.collectionStudent = collectionStudent;
    }

    public StudentClass() {

    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "classId=" + classId +
                ", studentCount=" + studentCount +
                ", collectionStudent=" + collectionStudent +
                '}';
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(Integer studentCount) {
        this.studentCount = studentCount;
    }

    public Collection getCollectionStudent() {
        return collectionStudent;
    }

    public void setCollectionStudent(Collection collectionStudent) {
        this.collectionStudent = collectionStudent;
    }
}
