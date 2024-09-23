import model.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("- ".repeat(40));

        List<User> users = new ArrayList<>();
        users.add(new User("Manish", "pass", "mani@gmail.com", "3474394690"));
        users.add(new User("Brock", "pass", "brock@gmail.com", "3474404949"));




    }
}