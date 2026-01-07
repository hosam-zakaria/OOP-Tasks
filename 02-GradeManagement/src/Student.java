import java.util.HashMap;
import java.util.Map;

public class Student {
    private String studentId;
    private String name;
    private String email;
    ///  name        subject (Key , value);
    Map<String, Double> grades = new HashMap<>();

    // Constructor
    public Student(String id, String n, String e) {
        this.studentId = id;
        this.name = n;
        this.email = e;
    }
    public void addGrade(String subject, double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.put(subject, grade);
        } else {
            System.out.println("Invalid grade! Must be 0-100.");
        }

    }
    public Double getGrade(String s) {
        return grades.get(s);
    }

    public int calculateAverage() {
        if (grades.isEmpty()) return 0;
        long sum = 0;
        for (String key : grades.keySet()) {
            sum += grades.get(key);
        }
        return (int)(sum / grades.size());
    }

    public String getLetterGrade() {
        int average = calculateAverage();

        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }

    public String getStudentInfo() {
        StringBuilder res = new StringBuilder("Name : " + name + "\n");
        for (String subject : grades.keySet()) {
            res.append(subject).append(" : ").append(grades.get(subject)).append("\n");
        }
        return res.toString();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}
