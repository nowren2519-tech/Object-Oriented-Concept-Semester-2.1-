abstract class Appliancee {

    abstract void turnOn();

    abstract void turnOff();
}

class Fan extends Appliancee {

    void turnOn() {
        System.out.println("Fan is turned ON.");
    }

    void turnOff() {
        System.out.println("Fan is turned OFF.");
    }
}

class Television extends Appliancee {

    void turnOn() {
        System.out.println("Television is turned ON.");
    }

    void turnOff() {
        System.out.println("Television is turned OFF.");
    }
}

class Refrigerator extends Appliancee {

    void turnOn() {
        System.out.println("Refrigerator is turned ON.");
    }

    void turnOff() {
        System.out.println("Refrigerator is turned OFF.");
    }
}

public class Applience {
    public static void main(String[] args) {

        Appliancee fan = new Fan();
        Appliancee tv = new Television();
        Appliancee fridge = new Refrigerator();

        fan.turnOn();
        fan.turnOff();

        tv.turnOn();
        tv.turnOff();

        fridge.turnOn();
        fridge.turnOff();
    }
}