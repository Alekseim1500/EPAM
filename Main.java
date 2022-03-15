import Comparators.MonthlyPaymentComparator;
import filters.MinInNetworkFilter;
import tariffs.AbstractTariff;
import tariffs.DefaultTariff;
import tariffs.InternetTariff;
import tariffs.Tariff;
import users.ManagerUser;
import users.User;
import users.VipUser;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;


public class Main {


    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        ArrayList<AbstractTariff> tariffs = new ArrayList<>();
        ArrayList<AbstractTariff> tariffs1 = new ArrayList<>();
        User user1 = new User("Alex", new Date(), "Apt 4B 2311 North Los Robles Avenue");
        users.add(user1);
        VipUser user2 = new VipUser("Dima", new Date(), "18 Red Avenue, Apt 5");
        users.add(user2);
        ManagerUser user3 = new ManagerUser("Diana", new Date(), "2311 North Los Robles Avenue, #Apt 4B");
        users.add(user3);
        DefaultTariff tariff1 = new DefaultTariff("Безлимитище", Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 25);
        tariffs.add(tariff1);
        DefaultTariff tariff2 = new DefaultTariff("Classic", 250, 100, 10);
        tariffs.add(tariff2);
        DefaultTariff tariff3 = new DefaultTariff("Super", 100, 100, 15);
        tariffs.add(tariff3);
        InternetTariff tariff4 = new InternetTariff("Безлимит", Double.POSITIVE_INFINITY, "Безлимит youtube", 100, 100, 20);
        tariffs.add(tariff4);
        InternetTariff tariff5 = new InternetTariff("Super+", 50, 200, 150, 25);
        tariffs.add(tariff5);
        System.out.println("Всего клиентов: " + users.size());
        Collections.sort(tariffs, new MonthlyPaymentComparator());

        for (Tariff tariff : tariffs) {
            System.out.println(tariff.getName() + " " + tariff.getMonthlyPayment());
        }


        System.out.println("\n\n");

        for (AbstractTariff tariff : tariffs) {
            if (new MinInNetworkFilter(50, 201).check(tariff)) {
                System.out.println(tariff.getName());
            }
        }


    }
}
