package tariffs;

import tariffs.AbstractTariff;

public class DefaultTariff extends AbstractTariff {

    private double monthlyPayment = 0;


    public DefaultTariff(String name, double minInNetwork, double minOutNetwork, double initialPayment) {
        super(name, minInNetwork, minOutNetwork, initialPayment);
        if (super.getMinInNetwork() == Double.POSITIVE_INFINITY) {
            monthlyPayment += 750;
        } else {
            monthlyPayment += super.getMinInNetwork() * 1;
        }

        if (super.getMinOutNetwork() == Double.POSITIVE_INFINITY) {
            monthlyPayment += 1250;
        } else {
            monthlyPayment += super.getMinOutNetwork() * 5;
        }
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }
}
