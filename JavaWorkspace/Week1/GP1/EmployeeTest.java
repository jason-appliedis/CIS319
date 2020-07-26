// Fig. 9.5: CommissionEmployeeTest.java
// CommissionEmployee class test program.

public class EmployeeTest 
{
   public static void main(String[] args) 
   {

         //employee 2
         //BasePlusCommision obj
      BasePlusCommissionEmployee employee02= new BasePlusCommissionEmployee (
         "BP28","Bob","lewis","333-333-3333",5000,.04,300);

      //get base salaried commision emp data
      System.out.println("Employee information obtained by get methods:%n");
      System.out.printf("%n%s %s%n", "Employee ID is",employee02.getEmployeeID());
      System.out.printf("%s %s%n", "First name is", employee02.getFirstName());
      System.out.printf("%s %s%n","Last name is", employee02.getLastName());
      System.out.printf("%s %s%n","Social security number is", employee02.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n","Gross  sales is", employee02.getGrossSales());
      System.out.printf("%s %.2f%n","Commision rate is", employee02.getCommissionRate());
      System.out.printf("%s %.2f%n","Base salary is", employee02.getBaseSalary());

      employee02.setBaseSalary(1000);

      System.out.printf("%n%s:%n%n%s%n",
      "Updated employee information obtained by toString",
      employee02.toString());

      // instantiate CommissionEmployee object
      CommissionEmployee employee = new CommissionEmployee(
         "CE17","Sue", "Jones", "222-222-2222", 10000, .06);      
      
      // get commission employee data
      System.out.println(
         "Employee information obtained by get methods:");
      System.out.printf("%n%s %s%n", "Employee ID is",employee.getEmployeeID());
      System.out.printf("%s %s%n", "First name is",
         employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         employee.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         employee.getCommissionRate());

      employee.setGrossSales(5000); 
      employee.setCommissionRate(.1); 
      
      System.out.printf("%n%s:%n%n%s%n",                                
         "Updated employee information obtained by toString", employee);

   
   } // end main
} // end class CommissionEmployeeTest


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
