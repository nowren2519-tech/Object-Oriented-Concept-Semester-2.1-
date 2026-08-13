class Cars {
    private String brand;
    private int speed;

    public Cars(String brand, int speed) {
        this.brand = brand;
        setSpeed(speed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed!");
        }
    }

    public void accelerate(int amount) {
        if (amount > 0) {
            speed += amount;
        } else {
            System.out.println("Invalid acceleration amount!");
        }
    }

    public void brake(int amount) {
        if (amount > 0) {
            speed -= amount;

            if (speed < 0) {
                speed = 0;
            }
        } else {
            System.out.println("Invalid braking amount!");
        }
    }

    public void showStatus() {
        System.out.println("Brand: " + brand);
        System.out.println("Current Speed: " + speed + " km/h");
    }
}

public class Car {
    public static void main(String[] args) {

        Cars car1 = new Cars("Toyota", 60);
        Cars car2 = new Cars("BMW", 80);

        car1.accelerate(30);
        car1.brake(20);

        car2.accelerate(40);
        car2.brake(150);

        car1.showStatus();

        System.out.println();

        car2.showStatus();
    }
}