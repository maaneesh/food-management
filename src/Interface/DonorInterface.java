package Interface;

import model.User;

public interface DonorInterface {
    void donateFood(int donorId);
    void viewDonatedFood(int id);
    User logOut();
}
