import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook("Computer Science 101");

        Student student1 = new Student("S001", "Alice Johnson", "alice@school.com");
        Student student2 = new Student("S002", "Bob Smith", "bob@school.com");
        Student student3 = new Student("S003", "Charlie Brown", "charlie@school.com");

        // Add grades for students
        student1.addGrade("Math", 95.0);
        student1.addGrade("English", 88.0);
        student1.addGrade("Science", 92.0);

        student2.addGrade("Math", 78.0);
        student2.addGrade("English", 85.0);
        student2.addGrade("Science", 80.0);

        student3.addGrade("Math", 90.0);
        student3.addGrade("English", 92.0);
        student3.addGrade("Science", 89.0);

        // Add students to gradebook
        gradeBook.addStudent(student1);
        gradeBook.addStudent(student2);
        gradeBook.addStudent(student3);

        System.out.println("------- Student Grade Management System ---------------\n");
        gradeBook.displayAllStudents();

        System.out.println("----------_________------------\n");
        System.out.println("Class Average: " + gradeBook.getClassAverage());

        System.out.println("----------_________------------\n");
        ArrayList<Student> topStudents = gradeBook.getTopStudents(2);
        System.out.println("Top 2 Students:");
        for (Student student : topStudents) {
            System.out.println(student.getName() + ": " + student.calculateAverage());
        }

        System.out.println("----------_________------------\n");
        System.out.println(student1.getStudentInfo());

        System.out.println("---------- END SYSTEMS ------------\n");
    }
}