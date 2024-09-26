package Implementation;

import Interface.DonorInterface;
import model.Food;
import model.User;

import java.util.List;
import java.util.Scanner;

public class DonorImpl implements DonorInterface {
    Scanner sc = new Scanner(System.in);

    @Override
    public void donateFood(int userId) {
        System.out.println("Donor donates food");
        UsersImpl usersImpl = new UsersImpl();
        List<Food> foodList = usersImpl.getFoodList();
        foodList.add(createFood(userId));

    }
    public Food createFood(int userId){
        System.out.println("Enter food name: ");
        String foodName = sc.nextLine();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Enter expiration date: ");
        String expirationDate = sc.nextLine();
        sc.nextLine();
        return new Food(foodName, quantity, expirationDate,userId);

    }

    @Override
    public void viewDonatedFood(int donorid) {

        List<Food> foodList = ConsumerImpl.getFoodList();
        for (Food food : foodList) {
            if (food.getDonorID() == donorid) {
                System.out.println(food);
            }
        }

    }


    @Override
    public User logOut() {
        System.out.println("You are logged out");
        return null;
    }

}
