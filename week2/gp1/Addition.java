import javax.swing.JOptionPane;

public class Addition {
    public static void main(String[] args){
        String firstNumber = JOptionPane.showInputDialog("Enter first double");
        String secondNumber = JOptionPane.showInputDialog("Enter second double");
        String thirdNumber = JOptionPane.showInputDialog("Enter third double");

        double number1 = Double.parseDouble(firstNumber);
        double number2 = Double.parseDouble(secondNumber);
        double number3 = Double.parseDouble(thirdNumber);

        double total = sum(number1,number2, number3);

        JOptionPane.showMessageDialog(null, "The sum is " + total, "Sum of Three dDoubles", JOptionPane.PLAIN_MESSAGE);
        
    }   
    
    private static double sum(double a, double b, double c){
        return a + b + c;
    }
}