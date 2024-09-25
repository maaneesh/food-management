package model;

import java.util.List;

public class Consumer extends User {
   // private List<Food> donatedFoodList;

    public Consumer(String name, String password, String email) {
        super(name, email, password, "consumer");
       // this.donatedFoodList = donatedFoodList;
    }

    // Consumers can retrieve donated food
    public void retrieveFood() {
//        if (donatedFoodList.isEmpty()) {
//            System.out.println("No food to retrieve.");
//        } else {
//            Food foodItem = donatedFoodList.remove(0);  // Removes the first food item
//            System.out.println(getName() + " retrieved: " + foodItem);
//        }
    }
}
