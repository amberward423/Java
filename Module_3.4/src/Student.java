import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;

 public Student(int id, String name, int age){
     this.id = id;
     this.name = name;
     this.age = age;
 }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
     this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setAge(int age){
        this.age = age;
    }
}
