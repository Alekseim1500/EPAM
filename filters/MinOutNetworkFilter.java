package filters;

import tariffs.Tariff;

public class MinOutNetworkFilter implements Filter {
    private double minFrom;
    private double minTo;

    public MinOutNetworkFilter(double minFrom, double minTo) {
        this.minFrom = minFrom;
        this.minTo = minTo;
    }

    @Override
    public boolean check(Tariff tariff) {
        return tariff.getMinOutNetwork() > minFrom == tariff.getMinOutNetwork() < minTo;
    }
}
