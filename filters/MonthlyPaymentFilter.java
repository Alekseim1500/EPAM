package filters;

import tariffs.Tariff;

public class MonthlyPaymentFilter implements Filter {
    private double paymentFrom;
    private double paymentTo;

    public MonthlyPaymentFilter(double paymentFrom, double paymentTo) {
        this.paymentFrom = paymentFrom;
        this.paymentTo = paymentTo;
    }

    @Override
    public boolean check(Tariff tariff) {
        return tariff.getMonthlyPayment() > paymentFrom == tariff.getMonthlyPayment() < paymentTo;
    }
}
