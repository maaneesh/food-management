package Implementation;

import Interface.UserInterface;
import model.Consumer;
import model.Donor;
import model.Food;
import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsersImpl implements UserInterface{
    // private Map<Integer, List<Food> > donatedFoodMap =  new HashMap<>();
    static List<User> userList = new ArrayList<>();
    private static List<Food> donatedFoodList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    static {
        User admin = new User("admin", "admin@admin.com", "admin", "admin");
        User consumer = new User("consumer", "consumer@consumer.com", "consumer", "consumer");
        User donor = new User("donor", "donor@donor.com", "donor", "donor");
        userList.add(admin);
        userList.add(consumer);
        userList.add(donor);
    }


    @Override
    public User signIn() {

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        User signedUser = authenticateUser(username, password);

        if (signedUser != null) {
            System.out.println("User signed in successfully.");
        }
        return signedUser;
    }

    public User authenticateUser(String username, String password) {
        System.out.println("Authenticating...");
        boolean signedIn = false;
        for (User user : userList) {
            if (user.getName().equals(username) && user.getPassword().equals(password)) {
                signedIn = true;
                return user;
            }
        }
        if (!signedIn) {
            System.out.println("Signing unsuccessful!");
        }

        return null;
    }

    @Override
    public User registerUser() {
        User newUser = askUser();
        if (newUser instanceof Consumer) {
            userList.add((Consumer) newUser);

        } else if (newUser instanceof Donor) {
            userList.add((Donor) newUser);
        }
        return newUser;
    }

    @Override
    public void viewUsers() {
        if (userList.isEmpty()) {
            System.out.println("No users found");
        }
        for (User user : userList) {
            System.out.println(user);
        }
    }

    private User askUser() {
        String username;
        while (true) {

            System.out.println("Please enter your username: ");
            username = scanner.nextLine();
            boolean userNameTaken = false;
            for (User user : userList) {
                if (user.getName().equals(username)) {
                    System.out.println(username + " already exists");
                    userNameTaken = true;
                    break;
                }
            }
            if (!userNameTaken) {
                break;
            }
        }

        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();
        System.out.println("Please enter your email: ");
        String email = scanner.nextLine();

        int role = 0;
        while (role != 1 && role != 2) {
            System.out.println("Please choose your role 1) Consumer or 2) Donor");
            if (scanner.hasNextInt()) {
                role = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                System.out.println("Invalid input. Please choose either 1 or 2");
            }

        }

        if (role == 1) {
            return new Consumer(username, password, email);
        }
        return new Donor(username, password, email);

    }
    public List<Food> getFoodList(){
        return donatedFoodList;
    }





}