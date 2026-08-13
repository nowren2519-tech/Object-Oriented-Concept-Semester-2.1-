class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        setPrice(price);
        setQuantity(quantity);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity!");
        }
    }

    public void increaseStock(int amount) {
        if (amount > 0) {
            quantity += amount;
        } else {
            System.out.println("Invalid stock amount!");
        }
    }

    public void decreaseStock(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
        } else {
            System.out.println("Not enough stock or invalid amount!");
        }
    }

    public void printDetails() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

public class ProductValue {
    public static void main(String[] args) {

        Product product1 = new Product("P101", "Laptop", 60000, 10);
        Product product2 = new Product("P102", "Mouse", 1000, 20);
        Product product3 = new Product("P103", "Keyboard", 2500, 15);

        product1.increaseStock(5);
        product1.decreaseStock(3);

        product2.increaseStock(10);
        product2.decreaseStock(5);

        product3.increaseStock(5);
        product3.decreaseStock(8);

        product1.printDetails();
        System.out.println();

        product2.printDetails();
        System.out.println();

        product3.printDetails();
    }
}