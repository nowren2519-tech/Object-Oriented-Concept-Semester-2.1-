import java.util.ArrayList;

class Professor {
    private String name;
    private String department;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void showDetails() {
        System.out.println("Professor Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Student {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void showDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class University {
    private ArrayList<Professor> professors;
    private ArrayList<Student> students;

    public University() {
        professors = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAllMembers() {
        System.out.println("=== Professors ===");

        for (Professor professor : professors) {
            professor.showDetails();
            System.out.println();
        }

        System.out.println("=== Students ===");

        for (Student student : students) {
            student.showDetails();
            System.out.println();
        }
    }
}

public class UniversityManagement    {
    public static void main(String[] args) {

        University university = new University();

        Professor professor1 =
                new Professor("Hasan Imam", "Computer Science");

        Professor professor2 =
                new Professor("Rahman Sir", "Software Engineering");

        Student student1 =
                new Student("Nowren", 101);

        Student student2 =
                new Student("Rahim", 102);

        Student student3 =
                new Student("Karim", 103);

        university.addProfessor(professor1);
        university.addProfessor(professor2);

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

        university.printAllMembers();
    }
}