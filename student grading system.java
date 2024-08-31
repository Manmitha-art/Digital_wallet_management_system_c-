// Base class for all students
class Student {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }
}

// Class for undergraduate students, inherits from Student
class Undergraduate extends Student {
    private double gpa;

    public Undergraduate(String name, int studentId, double gpa) {
        super(name, studentId);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Undergraduate Student: " + getName() + ", ID: " + getStudentId() + ", GPA: " + gpa;
    }
}

// Class for graduate students, inherits from Student
class Graduate extends Student {
    private String thesisTitle;

    public Graduate(String name, int studentId, String thesisTitle) {
        super(name, studentId);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    @Override
    public String toString() {
        return "Graduate Student: " + getName() + ", ID: " + getStudentId() + ", Thesis: " + thesisTitle;
    }
}

// Class for course with grading logic
class Course {
    private String courseName;
    private double maxGrade;

    public Course(String courseName, double maxGrade) {
        this.courseName = courseName;
        this.maxGrade = maxGrade;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getMaxGrade() {
        return maxGrade;
    }
}

// Class for student grades in a course
class Grade {
    private Student student;
    private Course course;
    private double grade;

    public Grade(Student student, Course course, double grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return student.getName() + " received a grade of " + grade + " in " + course.getCourseName();
    }
}

public class Main {
    public static void main(String[] args) {
        // Create some students
        Student student1 = new Undergraduate("Alice", 101, 3.8);
        Student student2 = new Graduate("Bob", 102, "Machine Learning");

        // Create some courses
        Course course1 = new Course("Introduction to Programming", 100);
        Course course2 = new Course("Advanced Algorithms", 100);

        // Assign grades
        Grade grade1 = new Grade(student1, course1, 95);
        Grade grade2 = new Grade(student2, course2, 88);

        // Print out grades
        System.out.println(grade1);
        System.out.println(grade2);
    }
}
