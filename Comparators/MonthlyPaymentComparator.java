package Comparators;

import tariffs.Tariff;

import java.util.Comparator;

public class MonthlyPaymentComparator implements Comparator<Tariff> {
    public int compare(Tariff t1, Tariff t2) {
        return Double.compare(t1.getMonthlyPayment(), t2.getMonthlyPayment());
    }
}
