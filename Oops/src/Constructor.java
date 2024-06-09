public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Kunal";
        s1.rollno = 123;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        System.out.println("Name: " +s1.name);
        Student s2 = new Student(s1);
        s2.name = "decv";
        s2.rollno = 43;
        System.out.println("Name: " + s2.name + " Rollno: " + s2.rollno);
        s1.marks[2] = 100;   // Here i'm updating the value it only reflects when i'm using shallow copy.
        for (int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }



    }
}

class Student {
     String name;
     int rollno;
     int[] marks;

     Student(){
         marks = new int[3];
         System.out.println("Student Class Constructor");
     }

/*
      Student(Student s1){// Shallow Copy its uses reference of the array that's why if any change made by s1 object it also reflect into s2
         marks = new int[3];
          this.name = s1.name;
          this.rollno = s1.rollno;
          this.marks = s1.marks;
      }

 */

    Student(Student s1){// Deep Copy
         marks = new int[3];
//         for (int i= 0; i<s1.marks.length;i++){
//             this.marks[i] = s1.marks[i];
//         }
       System.arraycopy(s1.marks, 0, this.marks, 0, s1.marks.length);
//        source_arr : array to be copied from
//        sourcePos : starting position in source array from where to copy
//        dest_arr : array to be copied in
//        destPos : starting position in destination array, where to copy in
//        len : total no. of components to be copied.
    }


}

