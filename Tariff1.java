abstract public class Tariff1 implements Tariff{
    private String name;
    private int internetGB;
    private String addInfo;
    private int minInNetwork;
    private int minOutNetwork;
    private double monthlyPayment;
    private double initialPayment;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getInternetGB(){
        return internetGB;
    }

    public void setInternetGB(int internetGB){
        this.internetGB=internetGB;
    }

    public String getAddInfo(){
        return addInfo;
    }

    public void setAddInfo(String addInfo){
        this.addInfo=addInfo;
    }

    public int getMinInNetwork(){
        return minInNetwork;
    }

    public void setMinInNetwork(int minInNetwork){
        this.minInNetwork=minInNetwork;
    }

    public int getMinOutNetwork(){
        return minOutNetwork;
    }

    public void setMinOutNetwork(int minOutNetwork){
        this.minOutNetwork=minOutNetwork;
    }

    public double getMonthlyPayment(){
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment){
        this.monthlyPayment=monthlyPayment;
    }

    public double getInitialPayment(){
        return initialPayment;
    }

    public void setInitialPayment(double initialPayment){
        this.initialPayment=initialPayment;
    }

}
