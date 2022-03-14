package users;

import java.util.ArrayList;
import java.util.Date;


public class VipUser extends User {

    public VipUser(String name, Date DOB, String address) {
        super(name, DOB, address);
    }

    public double getMonthPayment() {
        return super.getMonthPayment() * 0.9;
    }

}
