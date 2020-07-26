public class Department {
    private CommissionEmployee [] employees;
    private String departmentName;
    private String officeNumber;

    //costructor
    public Department(String  departmentName, String officeNumber, CommissionEmployee [] employees){
        this.employees = employees;
        this.departmentName = departmentName;                                    
        this.officeNumber = officeNumber;           
        
    }

    public String getOfficeNumber(){
        return officeNumber;
    }
    public String getDepartmentName(){
        return departmentName;
    }
    public void displayEmployees() {
        for(CommissionEmployee emp : employees){
            System.out.printf(emp.toString()); 
        }
    }
}