import java.io.Serializable;

public class Enrollment implements Serializable {
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(String enrollmentDate, Student student, Course course){
        this.enrollmentDate = enrollmentDate;
        this.student = student;
        this.course = course;

    }
    public Student getStudent(){
        return student;
        }
    public Course getCourse(){
        return course;
    }
    public String getEnrollmentDate(){
        return enrollmentDate;
    }
    public void setStudent(Student student){
        this.student= student;
    }
    public void setCourse(Course course){
        this.course= course;
    }
    public void setEnrollmentDate(String enrollmentDate){
        this.enrollmentDate = enrollmentDate;
    }
}
