public class DepartmentTest {
    private static String dept1 = "Online Sales";
    private static String dept2 = "Brick and Moter Sales";
    private static String officeNum1 = "OS123";
    private static String officeNum2 = "BMS321";
  

    public static void main(String[] args) {
        CommissionEmployee[] onlineEmpArr = new CommissionEmployee[4]; 
        CommissionEmployee[] brickAndMorterEmpArr= new CommissionEmployee[4]; 
        // build online emp arr
        onlineEmpArr[0] = new CommissionEmployee( "Sue", "Jones", "888-888-8888", 5000, 0.06 );
        onlineEmpArr[1] = new CommissionEmployee( "Jan", "Hall", "555-555-6666", 8000, 0.03  );
        onlineEmpArr[2] = new BasePlusCommissionEmployee( "Steve", "Smith ", "777-777-7777", 12000, 0.07, 500  );
        onlineEmpArr[3] = new BasePlusCommissionEmployee( "Jim", "Stewart", "444-444-4444", 6500, 0.06, 250 );

        brickAndMorterEmpArr[0] = new CommissionEmployee(  "Pam", "Sanchez", "333-333-3333", 7500, 0.08);
        brickAndMorterEmpArr[1] = new CommissionEmployee( "Andy", "Cook", "111-111-1111", 7000, 0.06 );
        brickAndMorterEmpArr[2] = new BasePlusCommissionEmployee( "Phylis", "Wood", "222-222-2222", 6000, 0.03, 900 );
        brickAndMorterEmpArr[3] = new BasePlusCommissionEmployee(  "Buzz", "Miller", "123-456-7890", 8500, 0.05, 150 );


        Department onlineSales = new Department(
            dept1,
            officeNum1,
            onlineEmpArr
        );
        Department brickAndMortorSales = new Department(
            dept2,
            officeNum2,
            brickAndMorterEmpArr
        ); 

        System.out.println("\n\n\n Graded Programming Exercise 1.1");

        System.out.printf("%n%s:%n %n%s%s %n%s%s %n%s",
        "Online Sales",
        "Department Name: ", onlineSales.getDepartmentName(),
        "Department Number: ",  onlineSales.getOfficeNumber(),
        "Employees:\n");
        onlineSales.displayEmployees();

        System.out.printf("%n%s:%n %n%s%s %n%s%s %n%s",
        "Brick and Mortor",
        "Department Name: ", brickAndMortorSales.getDepartmentName(),
        "Department Number: ",  brickAndMortorSales.getOfficeNumber(),
        "Employees:\n");
        brickAndMortorSales.displayEmployees();
    }
}