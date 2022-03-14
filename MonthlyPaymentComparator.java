import tariffs.AbstractTariff;

import java.util.Comparator;

public class MonthlyPaymentComparator implements Comparator<AbstractTariff> {
    public int compare(AbstractTariff t1, AbstractTariff t2) {
        return Double.compare(t1.getMonthlyPayment(), t2.getMonthlyPayment());
    }
}
