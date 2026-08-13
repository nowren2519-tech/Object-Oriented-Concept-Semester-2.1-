class Course {
    private String courseName;
    private String instructor;
    private int capacity;

    public Course(String courseName, String instructor, int capacity) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.capacity = capacity;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void showCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Capacity: " + capacity);
    }
}

class Student {
    private String name;
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void enroll(Course c) {
        System.out.println(name + " (" + email + ") enrolled in "
                + c.getCourseName());
    }
}

public class OnlineCourse {
    public static void main(String[] args) {

        Course course = new Course(
                "Java Programming",
                "Hasan Imam",
                50
        );

        Student student1 = new Student(
                "Nowren",
                "nowren@gmail.com"
        );

        Student student2 = new Student(
                "Rahim",
                "rahim@gmail.com"
        );

        Student student3 = new Student(
                "Karim",
                "karim@gmail.com"
        );

        course.showCourseInfo();

        System.out.println();

        student1.enroll(course);
        student2.enroll(course);
        student3.enroll(course);
    }
}