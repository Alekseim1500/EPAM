public interface Tariff {
    String getName();

    void setName(String name);

    double getInternetGB();

    void setInternetGB(int internetGB);

    String getAddInfo();

    void setAddInfo(String addInfo);

    double getMinInNetwork();

    void setMinInNetwork(int minInNetwork);

    double getMinOutNetwork();

    void setMinOutNetwork(int minOutNetwork);

    double getMonthlyPayment();

    void setMonthlyPayment(double monthlyPayment);

    double getInitialPayment();

    void setInitialPayment(double initialPayment);
}