package model;

public class Food {
    private String name;
    private int quantity;
    private String expirationDate;
    private int donorID;
    // Could be Date, but simplified to String for now

    public Food(String name, int quantity, String expirationDate, int donorID) {
        this.name = name;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
        this.donorID = donorID;
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
    public int getDonorID() {
        return donorID;
    }

    public void setDonorID(int donorID) {
        this.donorID = donorID;
    }


    @Override
    public String toString() {
        return name + " (Quantity: " + quantity + ", Expiration: " + expirationDate + ", DonorID: " + donorID +")";
    }
}
