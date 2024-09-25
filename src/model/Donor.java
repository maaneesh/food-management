package model;

import java.util.List;

public class Donor extends User{


    public Donor(String name, String password, String email) {
        super(name, email, password, "donor");
    }

    // Method to donate food
    public void donateFood(String foodName, int quantity, String expirationDate) {
        Food food = new Food(foodName, quantity, expirationDate);
        System.out.println(getName() + " donated: " + food);
    }
}
