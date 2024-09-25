package Implementation;

import Interface.ConsumerInterface;
import model.User;

public class ConsumerImpl  implements ConsumerInterface {


    @Override
    public void viewAvailableFood() {
        System.out.println("Available food list");

    }

    @Override
    public
    User logout() {
        System.out.println("Logout");
        return null;

    }
}
