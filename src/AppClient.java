import Implementation.ConsumerImpl;
import Implementation.DonorImpl;
import Implementation.UsersImpl;
import Interface.ConsumerInterface;
import Interface.DonorInterface;
import Interface.UserInterface;
import model.User;

import java.util.Scanner;

public class AppClient {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserInterface userInterface = new UsersImpl();

        User signedUser = null;
        boolean flag = true;

        while (flag) {
            if (signedUser == null) {
                System.out.println("Welcome to Libaray Client");
                System.out.println("Select an option ");
                System.out.println("1. Login  2. Register  3. View Users 4. Exit ");
                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {
                    case 1:
                        signedUser = userInterface.signIn();
                        break;
                    case 2:
                        signedUser = userInterface.registerUser();
                        break;
                    case 3:
                        userInterface.viewUsers();
                        break;
                    case 4:
                        System.out.println("Goodbye");
                        flag = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again");
                }

            } else if (signedUser.getRole().equals("admin")) {
                System.out.println("Welcome to Admin Client");

            } else if (signedUser.getRole().equals("consumer")) {
                ConsumerInterface consumerOptions = new ConsumerImpl();
                boolean consumerFlag = true;
                while (consumerFlag) {
                    System.out.println("Welcome to Consumer Client");
                    System.out.println("Select an option ");
                    System.out.println("1. View AvailableFood  2.Logout 3. Exit ");
                    int option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            consumerOptions.viewAvailableFood();
                            break;
                        case 2:
                            signedUser = consumerOptions.logOut();
                            consumerFlag = false;

                        case 3:
                            System.out.println("Goodbye");
                            consumerFlag = false;
                    }

                }

            } else if (signedUser.getRole().equals("donor")) {
                System.out.println("Welcome to Donor Client");
                DonorInterface donorOptions = new DonorImpl();
                boolean donorFlag = true;
                while (donorFlag) {
                    System.out.println("Select an option ");
                    System.out.println("1. Donate Food  2. View Food List  4. Logout");
                    int option = scanner.nextInt();
                    scanner.nextLine();
                    switch (option) {
                        case 1:
                            donorOptions.donateFood(signedUser.getId());
                            break;
                        case 2:
                           donorOptions.viewDonatedFood(signedUser.getId());
                            break;
                        case 4:
                            System.out.println("Goodbye");
                            signedUser = donorOptions.logOut();
                            donorFlag = false;

                    }
                }
            }
        }
    }
}
