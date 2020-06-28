public class CommisionEmployee extends Employee{
    protected double grossSales;
    protected double commissionRate;
    CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate ){
        super(firstName,lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;


    }

    public void setGrossSales(double value) {
        this.grossSales = value;
    }
    public double getGrossSales() {
        return this.grossSales;
    }


    public void setCommissionRate(double value) {
        this.commissionRate = value;
    }
    public double getCommissionRate() {
        return this.commissionRate;
    }

    public double earnings(){
        return this.grossSales * this.commissionRate;
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
        "commission employee", getFirstName(), getLastName(), 
        "social security number", getSocialSecurityNumber(),
        "gross sales", getGrossSales(),
        "commision rate", getCommissionRate(),
        "total earnings" , earnings());
    }
}