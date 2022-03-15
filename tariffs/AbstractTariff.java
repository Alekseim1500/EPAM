package tariffs;

import java.util.ArrayList;
import java.util.List;


abstract public class AbstractTariff implements Tariff {
    private String name;
    private double minInNetwork;
    private double minOutNetwork;
    private double initialPayment;


    public AbstractTariff(String name, double minInNetwork, double minOutNetwork, double initialPayment) {
        this.name = name;
        this.minInNetwork = minInNetwork;
        this.minOutNetwork = minOutNetwork;
        this.initialPayment = initialPayment;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMinInNetwork() {
        return minInNetwork;
    }

    public void setMinInNetwork(int minInNetwork) {
        this.minInNetwork = minInNetwork;
    }

    public double getMinOutNetwork() {
        return minOutNetwork;
    }

    public void setMinOutNetwork(int minOutNetwork) {
        this.minOutNetwork = minOutNetwork;
    }

    public double getInitialPayment() {
        return initialPayment;
    }

    public void setInitialPayment(double initialPayment) {
        this.initialPayment = initialPayment;
    }

}
