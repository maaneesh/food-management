package Interface;

import model.User;

public interface DonorInterface {
    void donateFood(int donorId);
    //update donate food method so the expiration date works properly
    void viewDonatedFood(int id);
    User logOut();
}
