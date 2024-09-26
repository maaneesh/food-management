package Implementation;

import Interface.ConsumerInterface;
import model.Food;
import model.User;

import java.util.List;

public class ConsumerImpl  implements ConsumerInterface {


    @Override
    public void viewAvailableFood() {
        System.out.println("Welcome!\nPlease select any food you'd like.");
        getFoodList();
    }

    static List<Food> getFoodList() {
        UsersImpl usersImpl = new UsersImpl();
        return usersImpl.getFoodList();

    }

    @Override
    public User logOut() {
        System.out.println("You are logged out");
        return null;
    }
}
