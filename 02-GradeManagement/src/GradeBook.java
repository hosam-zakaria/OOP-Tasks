import java.util.ArrayList;
import java.util.List;

public class GradeBook {
    private String className;
    ArrayList<Student> students = new ArrayList<>();

    public GradeBook(String c) {
        this.className = c;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String id) {
        for (int i = 0; i < students.size(); i++){
            if(students.get(i).getStudentId().equals(id)) {
                students.remove(i);
                System.out.println("Student with ID " + id + " removed.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public Student findStudent(String id) {
        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public double getClassAverage() {
        if (students.isEmpty()) return 0;
        double total = 0;
        for (Student s : students) {
            total += s.calculateAverage();
        }
        return (total / students.size());
    }

    public ArrayList<Student> getTopStudents(int count) {
        ArrayList<Student> sorted = new ArrayList<>(students);

        for (int i = 0; i < sorted.size() - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < sorted.size(); j++) {
                if (sorted.get(j).calculateAverage() > sorted.get(maxIndex).calculateAverage()) {
                    maxIndex = j;
                }
            }
            // swap
            Student temp = sorted.get(i);
            sorted.set(i, sorted.get(maxIndex));
            sorted.set(maxIndex, temp);
        }

        return new ArrayList<>(sorted.subList(0, Math.min(count, sorted.size())));
    }


    public void displayAllStudents() {
        for(Student s : students) {
            System.out.println(s.getStudentInfo() + " | Average: " + s.calculateAverage());
        }
    }
    public void getStudentsByLetterGrade(String letterGrade) {
        for(Student s : students) {
            if (s.getLetterGrade().equalsIgnoreCase(letterGrade)) {
                System.out.println(s.getStudentInfo() + " | Letter Grade: " + s.getLetterGrade());
            }
        }
    }
}
