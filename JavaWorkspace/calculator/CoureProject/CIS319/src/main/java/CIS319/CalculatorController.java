package CIS319;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class CalculatorController {
    private static String firstNumber = "";
    private static String secondNumber = "";
    private static String stoerNumInMemory = "";
    private static String operator = "";
    @FXML
    private TextArea numberDisplay;
    @FXML
    private Button memoryRecall;

    @FXML
    private Button isNegative;

    @FXML
    private Button clearEverything;

    @FXML
    private Button addMemory;

    @FXML
    private Button clear;

    @FXML
    private Button divide;

    @FXML
    private Button memoryClear;

    @FXML
    void setTextOnButtonClick(final ActionEvent e) {
        final Button btn = (Button) e.getSource();
        handleCalculatorInputChange(btn.getId(), btn.getText());
    }

    @FXML
    private void handleKeyPress(final KeyEvent e) {
        handleCalculatorInputChange(e.getCode().toString(), e.getText());
    }

    //takes a generic to allow handling of keycodes and normal strings 
    //optional values to handle logic if the buttons are pressed or if the keys are pressed
    public <T> void handleCalculatorInputChange(final T btnPressed, final String btnTextValue) {
        switch ((String) btnPressed) {
            case "memoryClear":
                stoerNumInMemory = "0";
                break;
            case "memoryRecall":
                numberDisplay.setText(stoerNumInMemory);
                break;
            case "addMemory":
                stoerNumInMemory = numberDisplay.getText();
                // clear text area
                numberDisplay.setText("");
                break;
            case "clear":
                // clear text area
                numberDisplay.setText("");
                break;
            case "clearEverything":
                stoerNumInMemory = "";
                restCalcVariables();
                numberDisplay.setText("");
                break;
            case "isNegative":
                if (numberDisplay.getText().contains("-")) {
                    numberDisplay.setText(numberDisplay.getText().replace("-", ""));
                } else {
                    final String tempNegDisplay = "-" + numberDisplay.getText();
                    numberDisplay.setText(tempNegDisplay);
                }
                break;
            case "ADD":
            case "SUBTRACT":
            case "MULTIPLY":
            case "DIVIDE":
                operator = (String) btnPressed;
                if (firstNumber.isEmpty()) {
                    firstNumber = numberDisplay.getText();
                    numberDisplay.setText("");
                } else if (secondNumber.isEmpty()) {
                    numberDisplay.setText(firstNumber);
                } else {
                    secondNumber = numberDisplay.getText();
                    // used to reset first calue in the event that the use is still typeing numbers
                    // and operators
                    final String tempResult = Math.calculateTotal(firstNumber, secondNumber, operator).toString();
                    numberDisplay.setText(tempResult);
                    restCalcVariables();
                    firstNumber = tempResult;
                }
                break;
            case "equals":
            case "ENTER":
                if (secondNumber.isEmpty()) {
                    secondNumber = "0";
                }
                secondNumber = numberDisplay.getText();
                final String tempResult = Math.calculateTotal(firstNumber, secondNumber, operator).toString();
                numberDisplay.setText(tempResult);
                restCalcVariables();
                firstNumber = tempResult;
                break;
            case "decimal":
            case "DECIMAL" :
                if (!numberDisplay.getText().contains(".")) {
                    numberDisplay.setText(numberDisplay.getText() + btnTextValue);
                }
                break;
            default:
            if (firstNumber.isEmpty() && !operator.isEmpty()) {
                firstNumber = firstNumber + btnTextValue;
                numberDisplay.setText(firstNumber);
            } else if (secondNumber.isEmpty() && !operator.isEmpty()) {
                secondNumber = btnTextValue;
                numberDisplay.setText(secondNumber);
            } else {
                numberDisplay.setText(numberDisplay.getText() + btnTextValue); 
            }
                break;
        }
    }

    // resetes the class members to clear out the calculator
    private static void restCalcVariables() {
        secondNumber = "";
        firstNumber = "";
        stoerNumInMemory = "0";
    }

    public void initialize() {
        numberDisplay.requestFocus();
    }

}