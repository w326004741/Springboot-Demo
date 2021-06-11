package springbootdemo.model;

/**
 * @author Weichen Wang
 * @date 2021/6/10 - 3:38 PM
 * @description: 实体类 Entity
 */
public class Student {
    private Long sid;
    private String studentName;
    private Course course;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", studentName='" + studentName + '\'' +
                ", course=" + course +
                '}';
    }
}
