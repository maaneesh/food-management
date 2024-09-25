package model;

public class Food {
    private String name;
    private int quantity;
    private String expirationDate;  // Could be Date, but simplified to String for now

    public Food(String name, int quantity, String expirationDate) {
        this.name = name;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return name + " (Quantity: " + quantity + ", Expiration: " + expirationDate + ")";
    }
}
