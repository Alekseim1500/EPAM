import java.util.Date;
import java.util.ArrayList;


public class Main {
    public static final double POSITIVE_INFINITY = 1.0 / 0.0;

    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Tariff> tariffs = new ArrayList<>();
        User user1 = new User("Alex",new Date(), "Apt 4B 2311 North Los Robles Avenue");
        users.add(user1);
        User user2 = new User("Dima",new Date(), "18 Red Avenue, Apt 5");
        users.add(user2);
        User user3 = new User("Diana",new Date(), "2311 North Los Robles Avenue, #Apt 4B");
        users.add(user3);
        DefaultTariff tariff1 = new DefaultTariff("Безлимитище",POSITIVE_INFINITY,POSITIVE_INFINITY,POSITIVE_INFINITY,25);
        tariffs.add(tariff1);
        DefaultTariff tariff2 = new DefaultTariff("Classic",5,250,100,10);
        tariffs.add(tariff2);
        DefaultTariff tariff3 = new DefaultTariff("Super",20,"Безлимит для youtube и instagram",100,100,15);
        tariffs.add(tariff3);
        DefaultTariff tariff4 = new DefaultTariff("Безлимит",POSITIVE_INFINITY,"Безлимит для youtube и instagram",100,100,20);
        tariffs.add(tariff4);
        DefaultTariff tariff5 = new DefaultTariff("Super+",POSITIVE_INFINITY,"Безлимит для youtube, instagram, vk, telegram",200,150,25);
        tariffs.add(tariff5);
        System.out.println("Уже что-то есть");
    }
}
