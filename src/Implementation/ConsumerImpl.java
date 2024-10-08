package Implementation;

import Interface.ConsumerInterface;
import model.Food;
import model.User;

import java.util.List;
import java.util.Scanner;

public class ConsumerImpl implements ConsumerInterface {


    static List<Food> getFoodList() {
        UsersImpl usersImpl = new UsersImpl();
        return usersImpl.getFoodList();

    }

    @Override
    public void viewAvailableFood() {
        List<Food> availableFood = getFoodList();
        if (availableFood.isEmpty()) {
            System.out.println("Please check back soon for something delicious!");
        }else System.out.println("Here's everything for you to enjoy!");
        for (Food food : availableFood) {
            System.out.println(food);
        }
        boolean retrieveFlag = true;
        while (retrieveFlag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Did you want to take anything home?");
            System.out.println("1. Yes or 2. No");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    int id = retrieveFood();
                    for (Food food : availableFood) {
                        if (food.getDonorID() == id) {
                            System.out.println("Enjoy your " + food.getName());
                        }
                    }
                    // after the food has been retrieved, remove from the food list

                    break;

                case 2:
                    retrieveFlag = false;
            }
        }

    }

    public int retrieveFood() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose item using foodID: ");
        int foodID = sc.nextInt();
        System.out.println("Vending your food. Enjoy!");
        return foodID;
    }

    @Override
    public User logOut() {
        System.out.println("You are logged out");
        return null;
    }
}
