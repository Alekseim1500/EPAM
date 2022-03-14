package tariffs;

import tariffs.AbstractTariff;

public class InternetTariff extends AbstractTariff {
    private double internetGB;
    private String addInfo;
    private double monthlyPayment = 0;

    public InternetTariff(String name, double internetGB, String addInfo, double minInNetwork, double minOutNetwork, double initialPayment) {
        super(name, minInNetwork, minOutNetwork, initialPayment);
        this.internetGB = internetGB;
        this.addInfo = addInfo;
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

        if (internetGB == Double.POSITIVE_INFINITY) {
            monthlyPayment += 1750;
        } else {
            monthlyPayment += internetGB * 10;
        }
    }

    public InternetTariff(String name, double internetGB, double minInNetwork, double minOutNetwork, double initialPayment) {
        super(name, minInNetwork, minOutNetwork, initialPayment);
        this.internetGB = internetGB;
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

        if (internetGB == Double.POSITIVE_INFINITY) {
            monthlyPayment += 750;
        } else {
            monthlyPayment += internetGB * 10;
        }
    }

    public double getInternetGB() {
        return internetGB;
    }

    public void setInternetGB(double internetGB) {
        this.internetGB = internetGB;
    }

    public String getAddInfo() {
        return addInfo;
    }

    public void setAddInfo(String addInfo) {
        this.addInfo = addInfo;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }
}
