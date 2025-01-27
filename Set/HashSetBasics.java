package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasics {
    public static void main(String[] args) {
        // Create a HashSet
    Set<Student> studentset = new HashSet<>();
    studentset.add(new Student("John", 20));
    studentset.add(new Student("Anil", 20));
    studentset.add(new Student("Pankaj", 36));

    System.out.println(studentset);

        
    }
    


}
