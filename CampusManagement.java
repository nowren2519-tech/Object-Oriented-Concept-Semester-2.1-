class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person constructor called");
    }

    double calculateAllowance() {
        System.out.println("Base allowance calculated in Person class.");
        return 1000;
    }

    String getRole() {
        return "General Person";
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String studentId;

    Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
        System.out.println("Student constructor called");
    }

    @Override
    double calculateAllowance() {
        double allowance = super.calculateAllowance() + 500;
        System.out.println("Student allowance includes study materials.");
        return allowance;
    }

    @Override
    String getRole() {
        return "Student";
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Displaying Student information.");
    }

    void getDailySchedule() {
        System.out.println("Student attends classes and library sessions.");
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("Teacher constructor called");
    }

    @Override
    double calculateAllowance() {
        double allowance = super.calculateAllowance() + 800;
        System.out.println("Teacher allowance includes teaching bonus.");
        return allowance;
    }

    @Override
    String getRole() {
        return "Teacher";
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Displaying Teacher information.");
    }

    void getDailySchedule() {
        System.out.println(
                "Teacher conducts lectures, grading, and student advising."
        );
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
        System.out.println("Staff constructor called");
    }

    @Override
    double calculateAllowance() {
        double allowance = super.calculateAllowance() + 300;
        System.out.println("Staff allowance includes operational bonus.");
        return allowance;
    }

    @Override
    String getRole() {
        return "Administrative Staff";
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Displaying Staff information.");
    }

    void getDailySchedule() {
        System.out.println(
                "Staff handles office management and administrative support."
        );
    }
}

public class CampusManagement {
    public static void main(String[] args) {

        System.out.println("Creating Student:");
        Student student = new Student(
                "Nowren",
                21,
                "CSE101"
        );

        System.out.println();

        System.out.println("Creating Teacher:");
        Teacher teacher = new Teacher(
                "Hasan Imam",
                40,
                "Computer Science"
        );

        System.out.println();

        System.out.println("Creating Staff:");
        Staff staff = new Staff(
                "Rahim",
                35,
                "Administration"
        );

        System.out.println("\n--- Student Information ---");
        student.displayInfo();

        System.out.println("Allowance: "
                + student.calculateAllowance());

        System.out.println("Role: "
                + student.getRole());

        student.getDailySchedule();

        System.out.println("\n--- Teacher Information ---");
        teacher.displayInfo();

        System.out.println("Allowance: "
                + teacher.calculateAllowance());

        System.out.println("Role: "
                + teacher.getRole());

        teacher.getDailySchedule();

        System.out.println("\n--- Staff Information ---");
        staff.displayInfo();

        System.out.println("Allowance: "
                + staff.calculateAllowance());

        System.out.println("Role: "
                + staff.getRole());

        staff.getDailySchedule();
    }
}