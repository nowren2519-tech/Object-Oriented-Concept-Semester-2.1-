abstract class Employe {
    String name;
    int id;

    Employe(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employe {

    double monthlySalary;

    FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employe {

    double hours;
    double hourlyRate;

    PartTimeEmployee(String name, int id,
                     double hours, double hourlyRate) {
        super(name, id);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hours * hourlyRate;
    }
}

public class Employee {
    public static void main(String[] args) {

        Employe fullTime =
                new FullTimeEmployee("Rahim", 101, 50000);

        Employe partTime =
                new PartTimeEmployee("Karim", 102, 80, 500);

        System.out.println("Full Time Salary: "
                + fullTime.calculateSalary());

        System.out.println("Part Time Salary: "
                + partTime.calculateSalary());
    }
}