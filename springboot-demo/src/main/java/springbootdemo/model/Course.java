package springbootdemo.model;

//import javax.persistence.*;

/**
 * @author Weichen Wang
 * @date 2021/6/10 - 3:27 PM
 * @description:
 */

public class Course {

    private Long cid;
    private String courseName;


    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", coursename='" + courseName + '\'' +
                '}';
    }
}
