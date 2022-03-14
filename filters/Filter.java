package filters;

import tariffs.Tariff;

public interface Filter {
    boolean check(Tariff tariff);
}
