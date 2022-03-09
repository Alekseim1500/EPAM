public class DefaultTariff extends Tariff1 {
    private String name;
    private double internetGB;
    private String addInfo;
    private double minInNetwork;
    private double minOutNetwork;
    private double monthlyPayment;
    private double initialPayment;
    final double POSITIVE_INFINITY = 1.0 / 0.0;


    public DefaultTariff(String name, double internetGB, String addInfo, double minInNetwork, double minOutNetwork, double initialPayment) {
        this.name = name;
        this.internetGB = internetGB;
        this.addInfo = addInfo;
        this.minInNetwork = minInNetwork;
        this.minOutNetwork = minOutNetwork;
        this.initialPayment = initialPayment;
    }

    public DefaultTariff(String name, double internetGB, double minInNetwork, double minOutNetwork, double initialPayment) {
        this.name = name;
        this.internetGB = internetGB;
        this.addInfo = "";
        this.minInNetwork = minInNetwork;
        this.minOutNetwork = minOutNetwork;
        this.initialPayment = initialPayment;
    }


    public double getMonthlyPayment(){
        if(minInNetwork==POSITIVE_INFINITY) {
            monthlyPayment+=750;
        }else  {
            monthlyPayment+=minInNetwork*1;
        }

        if(minOutNetwork==POSITIVE_INFINITY){
            monthlyPayment += 1250;
        } else  {
            monthlyPayment += minOutNetwork*5;
        }

        if(internetGB==POSITIVE_INFINITY){
            monthlyPayment += 1750;
        }else {
            monthlyPayment += internetGB * 10;
        }
        return monthlyPayment;
    }
}
