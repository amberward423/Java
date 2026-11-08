import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"Amber",25);
        Course course = new Course("1001", "Java","Juha");
        Enrollment enrollment = new Enrollment("2026-11-08",student,course);


        try {
            FileOutputStream stream = new FileOutputStream("enrollments.ser");
            ObjectOutputStream objectStream = new ObjectOutputStream(stream);
            objectStream.writeObject(enrollment);
            objectStream.close();
        } catch (IOException e) {
            System.out.println("There is an error");
        }
        try {
            FileInputStream stream = new FileInputStream("enrollments.ser");
            ObjectInputStream objectStream = new ObjectInputStream(stream);
            Enrollment savedEnrollment = (Enrollment) objectStream.readObject();
            System.out.println(savedEnrollment.getStudent().getName());
            System.out.println(savedEnrollment.getCourse().getCourseName());
            System.out.println(savedEnrollment.getCourse().getInstructor());
            objectStream.close();

        }catch (IOException  |ClassNotFoundException e) {
            System.out.println("There is an error");

        }

    }
}
