class Vehicle {
    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("Vehicle constructor called");
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
        System.out.println("Car constructor called");
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class vehicleManagement{
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Corolla", 4);

        car.displayDetails();
    }
}