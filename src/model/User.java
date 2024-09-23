package model;

public class User {
    private static int counter = 1;
    private int id;
    private String name;
    private String password;
    private String email;
    private String phone;

    public User(String name, String password, String email, String phone) {
        this.id = counter++;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;

    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        User.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email;
    }


}
