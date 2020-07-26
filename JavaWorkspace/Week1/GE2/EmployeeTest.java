public class EmployeeTest {
    public static void main(String[] args){
        int arraySize = 10;
        Employee[] empArray = new Employee[arraySize]; 
        empArray[0] = new BasePlusCommissionEmployee("Bob","Lewis", "333-33-3333", 5000, 0.04, 300);
        empArray[1] = new BasePlusCommissionEmployee("Mary","Sanchez","123-45-6789",6500,0.05,250);
        empArray[2] = new BasePlusCommissionEmployee("Barry", "Barnes", "321-54-9876", 7500, 0.04,320);
        empArray[3] = new CommisionEmployee("Pat", "Marquet", "555-55-5555", 8000, 0.05);
        empArray[4] = new CommisionEmployee("Mike" , "Jackson", "987-65-4321", 11000, 0.07);
        empArray[5] = new CommisionEmployee("Drew", "Smith", "111-22-1111", 5000, 0.05);
        empArray[6] = new SalariedEmployee("Ted","Roosevelt", "444-44-4444", 45000);
        empArray[7] = new CommisionEmployee("Sue ","Jones", "222-22-2222", 10000, 0.06);
        empArray[8] = new SalariedEmployee("Fred","Jordan", "555-44-55555", 55000);
        empArray[9] = new SalariedEmployee("Ned","Flanders", "666-66-6666", 66000);

        System.out.println("\n\n\nJason Stoddard Graded Programming Excersise 1.2");

        for(int i = 0; i < 10; i++){
            System.out.printf("%n%s%n", empArray[i]);
        }

    }

}