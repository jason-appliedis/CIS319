// Fig. 9.5: CommissionEmployeeTest.java
// CommissionEmployee class test program.

public class EmployeeTest 
{
   public static void main(String[] args) 
   {
      int arrSize = 5;
      CommissionEmployee   [] employee  = new CommissionEmployee [arrSize];
      employee[0] = new CommissionEmployee ("Sue", "Jones","222-22-2222", 10000, 0.06); 
      employee[1] = new BasePlusCommissionEmployee ("Bob","lewis","333-333-3333", 5000, .04, 300); 
      employee[2] = new BasePlusCommissionEmployee ("Mary", "Sanchez","123-45-6789", 6500, 0.05, 250); 
      employee[3] = new CommissionEmployee ("Pat", "Marquet","555-55-5555", 8000, 0.05); 
      employee[4] = new CommissionEmployee ("Mick", "Johnson","987-65-4321", 11000, 0.07); 

      System.out.printf("%n%n%s%n%n","Jason Stoddard Graded practice 1-2");
      for(int i = 0; i < 5; i++){
         System.out.printf("%n%s:%n%n%s%n",                                
         "Updated employee information obtained by toString", employee[i]);
      }
   } 
} 