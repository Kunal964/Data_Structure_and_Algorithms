package Set;

public class Student {
    String name;
    int rollno;

    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
     @Override
     public String toString() {
        return "Student [name=" + name + ", rollno=" + rollno + "]";
     }
    
}
