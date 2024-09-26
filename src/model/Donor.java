package model;

import java.util.List;

public class Donor extends User{


    public Donor(String name, String password, String email) {
        super(name, email, password, "donor");
    }

}
