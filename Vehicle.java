abstract class Vehiclee {
    int speed;
    String color;

    Vehiclee(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    abstract void startEngine();
}

class Car extends Vehiclee {

    Car(int speed, String color) {
        super(speed, color);
    }

    void startEngine() {
        System.out.println("Car engine starts with a key.");
    }
}

class Bike extends Vehiclee {

    Bike(int speed, String color) {
        super(speed, color);
    }

    void startEngine() {
        System.out.println("Bike engine starts with a self-start button.");
    }
}

class Truck extends Vehiclee {

    Truck(int speed, String color) {
        super(speed, color);
    }

    void startEngine() {
        System.out.println("Truck engine starts with a heavy-duty ignition.");
    }
}

public class Vehicle {
    public static void main(String[] args) {

        Vehiclee car = new Car(120, "Red");
        Vehiclee bike = new Bike(80, "Black");
        Vehiclee truck = new Truck(70, "Blue");

        car.startEngine();
        bike.startEngine();
        truck.startEngine();
    }
}