public class BasePlusCommissionEmployee extends CommisionEmployee{
    private double baseSalary;
    BasePlusCommissionEmployee(String firstName,String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double value) {
        this.baseSalary = value;
    }
    public double getBaseSalary() {
        return this.baseSalary;
    }

    @Override
    public double earnings(){
        return this.baseSalary + (this.commissionRate * this.grossSales);
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
        "base plus commission employee", getFirstName(), getLastName(), 
        "social security number", getSocialSecurityNumber(),
        "gross sales", getGrossSales(),
        "commision rate", getCommissionRate(),
        "base salary", getBaseSalary(),
        "total earnings", earnings() );
    }
}