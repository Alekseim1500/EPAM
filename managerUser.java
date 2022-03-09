import java.util.ArrayList;
import java.util.Date;


public class managerUser extends User{
    private String name;
    private Date DOB;
    private String adress;
    private ArrayList<Tariff> Tariffs;
    private double monthPayment=0;


    public managerUser(String name, Date DOB, String adress) {
        super(name, DOB, adress);
        this.name = name;
        this.DOB = DOB;
        this.adress = adress;
    }

    public double getMonthPayment(){
        for(Tariff tariff : Tariffs) {
            monthPayment+=tariff.getMonthlyPayment();
        }
        return monthPayment*0.5;
    }
}
