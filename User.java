import java.util.Date;
import java.util.ArrayList;

public class User {
    private String name;
    private Date DOB;
    private String adress;
    private ArrayList<Tariff> Tariffs;
    private double monthPayment=0;

    public User(String name, Date DOB, String adress) {
        this.name = name;
        this.DOB = DOB;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public ArrayList<Tariff> getNumbers() {
        return Tariffs;
    }

    public Tariff getNumberById(int index) {
        return Tariffs.get(index);
    }

    public void addNumber(Tariff number) {
        Tariffs.add(number);
    }

    public void delNumber(int index) {
        Tariffs.remove(index);
    }

    public void setMonthPayment(double monthPayment) {
        this.monthPayment = monthPayment;
    }

    public double getMonthPayment(){
        for(Tariff tariff : Tariffs) {
            monthPayment+=tariff.getMonthlyPayment();
        }
        return monthPayment;
    }



}
