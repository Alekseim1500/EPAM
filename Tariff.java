public interface Tariff {
    double getMonthlyPayment();

    String getName();

    void setName(String name);

    double getMinInNetwork();

    void setMinInNetwork(int minInNetwork);

    double getMinOutNetwork();

    void setMinOutNetwork(int minOutNetwork);

    double getInitialPayment();

    void setInitialPayment(double initialPayment);

}