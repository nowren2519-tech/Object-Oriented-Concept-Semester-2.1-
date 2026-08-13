abstract class Transport {

    abstract void bookTicket();

    abstract double calculateFare();
}

class Bus extends Transport {

    void bookTicket() {
        System.out.println("Bus ticket booked.");
    }

    double calculateFare() {
        return 500;
    }
}

class Train extends Transport {

    void bookTicket() {
        System.out.println("Train ticket booked.");
    }

    double calculateFare() {
        return 800;
    }
}

class Airplane extends Transport {

    void bookTicket() {
        System.out.println("Airplane ticket booked.");
    }

    double calculateFare() {
        return 5000;
    }
}

public class BookingSystem {
    public static void main(String[] args) {

        Transport bus = new Bus();
        Transport train = new Train();
        Transport airplane = new Airplane();

        bus.bookTicket();
        System.out.println("Bus Fare: " + bus.calculateFare());

        train.bookTicket();
        System.out.println("Train Fare: " + train.calculateFare());

        airplane.bookTicket();
        System.out.println("Airplane Fare: "
                + airplane.calculateFare());
    }
}