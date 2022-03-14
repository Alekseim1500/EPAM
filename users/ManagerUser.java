package users;

import users.User;

import java.util.Date;


public class ManagerUser extends User {

    public ManagerUser(String name, Date DOB, String address) {
        super(name, DOB, address);
    }

    public double getMonthPayment() {
        return super.getMonthPayment() * 0.5;
    }
}
