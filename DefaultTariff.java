public class DefaultTariff extends Tariff1 {
    private String name;
    private int internetGB;
    private String addInfo;
    private int minInNetwork;
    private int minOutNetwork;
    private double monthlyPayment;
    private double initialPayment;


    public DefaultTariff(String name, int internetGB, String addInfo, int minInNetwork, int minOutNetwork, double initialPayment) {
        this.name = name;
        this.internetGB = internetGB;
        this.addInfo = addInfo;
        this.minInNetwork = minInNetwork;
        this.minOutNetwork = minOutNetwork;
        this.initialPayment = initialPayment;
    }


    public double getMonthlyPayment(){
        monthlyPayment=internetGB*10+minInNetwork*1+minOutNetwork*1;
        return monthlyPayment;
    }
}
