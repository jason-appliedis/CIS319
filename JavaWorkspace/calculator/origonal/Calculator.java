import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Calculator {
    public static void main(String[] args) {
        System.out.println("\n\n\nWelcome to CIS319 CalcWiz");
        // get user
        //store array of numbers to get value
        //regex to get any character not a digit or period
        //create formatter
        //add while loop constant
        Scanner userInput = new Scanner(System.in);
        Pattern r = Pattern.compile("[^\\d.]");
        ArrayList<String> numberEntered = new ArrayList<String>();
        Boolean keepAddingNumbers = true;
        while (keepAddingNumbers) {
            System.out.println("Enter a digit: (enter double digit to stop): ");
            //add element to array list 
            numberEntered.add(userInput.nextLine());

            //remove duplicate period
            if(Collections.frequency(numberEntered, ".") > 1 || r.matcher(numberEntered.get(numberEntered.size() - 1)).matches()) {
                numberEntered.remove(numberEntered.size() - 1);
            }
            
            if(((String) numberEntered.get(numberEntered.size() - 1)).length() > 1){
                // remove last element 
                numberEntered.remove(numberEntered.size() - 1);
                keepAddingNumbers = false;
            }

             //display number so far if user does not exit
            System.out.printf("\nNumber so far: %s%n", buildNumberEnteredString(numberEntered));
        }//end while 
        //clear scannar obj and print numbers
        userInput.close();
        String numArrToString = buildNumberEnteredString(numberEntered);
        double numberArrToDbl = Double.parseDouble(numArrToString);
        System.out.printf("\nFinal value as a string: %s", numArrToString);
        System.out.printf("\nFinal value as a double: %f", numberArrToDbl);
        System.out.printf("\nFinal value as a string with commas: %s", String.format("%,f",numberArrToDbl));
        System.out.println("\n\n\nThank you for using CIS319 CalcWiz");
        //end program
        System.exit(0);
        
    }

    private static String buildNumberEnteredString(ArrayList<String> numbersEntered) {
        StringBuffer numbersEnteredString = new StringBuffer();
        for (int i = 0; i < numbersEntered.size(); i++) {
            numbersEnteredString.append(numbersEntered.get(i));
        }
        //format to round to 9 decimals 
        BigDecimal roundNine = new BigDecimal(numbersEnteredString.toString());
        roundNine.setScale(9, RoundingMode.HALF_UP);
        return roundNine.toString();
    }
}



/**
 * Calculator application
 * Requirements 
 * Java FX to build gui and Scene builder
 * Naming Connevtions 
 * Add, subtract multiply, divide
 * account for division by zero
 * Clear Button
 * MC, M+ , and MR buttons 
 * clicking buttons
 * operate from keyboard
 * Company Logo
 * Read only field
 * 
 * 
 * Week 2 
 * 
 * Enter a value
 * ignore second decimals (no error message)
 * Display value as Double  
 * 
 * Week3
 * 
 * Week 4
 * 
 * Week 5
 */