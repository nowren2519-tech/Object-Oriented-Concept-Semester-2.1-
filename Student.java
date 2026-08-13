class Students {
    private String name;
    private int age;

    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Student {
    public static void main(String[] args) {

        Students student1 = new Students("Nowren", 21);
        student1.displayInfo();

        System.out.println();

        Students student2 = new Students("Rahim", 20);
        student2.setName("Karim");
        student2.setAge(22);
        student2.displayInfo();
    }
}