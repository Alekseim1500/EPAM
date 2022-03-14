package users;


import tariffs.Tariff;

import java.util.Date;
import java.util.ArrayList;

public class User {
    private String name;
    private Date DOB;
    private String address;
    private ArrayList<Tariff> tariffs;
    private double monthPayment = 0;

    public User(String name, Date DOB, String address) {
        this.name = name;
        this.DOB = DOB;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Tariff> getNumbers() {
        return tariffs;
    }

    public Tariff getNumberById(int index) {
        return tariffs.get(index);
    }

    public void addNumber(Tariff number) {
        tariffs.add(number);
    }

    public void delNumber(int index) {
        tariffs.remove(index);
    }

    public void setMonthPayment(double monthPayment) {
        this.monthPayment = monthPayment;
    }

    public double getMonthPayment() {
        monthPayment = 0;
        for (Tariff tariff : tariffs) {
            monthPayment += tariff.getMonthlyPayment();
        }
        return monthPayment;
    }

}
