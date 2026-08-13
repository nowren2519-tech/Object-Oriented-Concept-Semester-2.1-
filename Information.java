class Address {
    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String summary() {
        return city + ", " + country;
    }
}

class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void printProfile() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.summary());
    }
}

public class Information {
    public static void main(String[] args) {

        Address address = new Address("Chattogram", "Bangladesh");

        Person person = new Person("Nowren", address);

        person.printProfile();
    }
}