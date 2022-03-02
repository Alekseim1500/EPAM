public interface Tariff {
    String getName();

    void setName(String name);

    int getInternetGB();

    void setInternetGB(int internetGB);

    String getAddInfo();

    void setAddInfo(String addInfo);

    int getMinInNetwork();

    void setMinInNetwork(int minInNetwork);

    int getMinOutNetwork();

    void setMinOutNetwork(int minOutNetwork);

    double getMonthlyPayment();

    void setMonthlyPayment(double monthlyPayment);

    double getInitialPayment();

    void setInitialPayment(double initialPayment);
}