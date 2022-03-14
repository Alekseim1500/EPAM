package filters;

import tariffs.Tariff;

public class MinInNetworkFilter implements Filter {
    private double minFrom;
    private double minTo;

    public MinInNetworkFilter(double minFrom, double minTo) {
        this.minFrom = minFrom;
        this.minTo = minTo;
    }

    @Override
    public boolean check(Tariff tariff) {
        return tariff.getMinInNetwork() > minFrom == tariff.getMinInNetwork() < minTo;
    }
}
