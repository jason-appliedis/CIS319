public class SalariedEmployee extends Employee{
    private double annualSalary;
    public SalariedEmployee(String firstName,String lastName, String socialSecurityNumber, double annualSalary){
        super(firstName, lastName,socialSecurityNumber);
        this.annualSalary = annualSalary;
    }

    public void setAnnualSalary(double value){
        this.annualSalary = value;
    }
    public double getAnnualSalary(){
        return this.annualSalary;
    }
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n", 
        "salaried employee", getFirstName(), getLastName(), 
        "social security number", getSocialSecurityNumber(),
        "annnual salary", getAnnualSalary());
    }
}