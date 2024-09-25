package Implementation;

import Interface.DonorInterface;
import model.Food;
import model.User;

import java.util.Scanner;

public class DonorImpl implements DonorInterface {
//    Scanner sc = new Scanner(System.in);s

    @Override
    public void donateFood() {
        System.out.println("Donor donates food");

    }

    @Override
    public void viewAvailableFood() {

    }

    @Override
    public User logOut() {
        System.out.println("You are logged out");
        return null;

    }
}
