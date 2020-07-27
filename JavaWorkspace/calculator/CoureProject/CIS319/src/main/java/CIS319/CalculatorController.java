package CIS319;

import java.math.BigDecimal;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import CIS319.Math;

public class CalculatorController {
    private static KeyCode enterKeyCode =  KeyCode.ENTER;
    private static String firstNumber;
    private static String secondNumber;
    private static String operator;
    private static String stoerNumInMemory;
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
        handleBtnClick(btn);
    }

    @FXML
    private void handleKeyPress(final KeyEvent e) {
        // look for operators
        KeyCode operator = e.getCode();


        System.out.println(operator);

        // look for enter keycodes
        // look for any item that is not a digit
        if (operator == enterKeyCode) {
            numberDisplay.setText("");
        }
        // handleKeyboardOperation(operator, )
    }
    // public void handleKeyboardOperation(KeyCode operator, String num){

    // }

    public void handleBtnClick(final Button btn) {
        switch (btn.getId()) {
            case "memoryClear":
                stoerNumInMemory = "0";
                break;
            case "memoryRecall":
                    numberDisplay.setText(stoerNumInMemory);
                break;
            case "addMemory":
                stoerNumInMemory = numberDisplay.getText();
                //clear text area
                numberDisplay.setText("");
                break;
            case "clear":
                //clear text area
                numberDisplay.setText("");
                break;
            case "clearEverything":
                stoerNumInMemory ="";
                numberDisplay.setText("");
                break;
            case "isNegative":
                if(numberDisplay.getText().contains("-")){
                    numberDisplay.setText(numberDisplay.getText().replace("-",""));
                }else{
                    numberDisplay.setText(numberDisplay.getText());
                }
                break;
            case "multiply":
            case "divide":
            case "minus":
            case "plus":
            System.out.println(btn.getId());
                if(firstNumber.length()<=0){
                    firstNumber = numberDisplay.getText();
                }else{
                    secondNumber = numberDisplay.getText();
                }
                operator = btn.getId();
                numberDisplay.setText("0");
                break;
            case "equals":
                Math.calculateTotal(firstNumber,secondNumber,operator);
                break;
            case "decimal":
                System.out.println(numberDisplay.getText());
                if (!numberDisplay.getText().contains(".")) {
                    final String textToSet = numberDisplay.getText() + btn.getText();
                System.out.println(textToSet);

                    numberDisplay.setText(textToSet);
                }
                break;
            default:
                
                numberDisplay.setText(numberDisplay.getText() + btn.getText());
                break;
        }
    }

    public void initialize() {
        numberDisplay.textProperty().addListener(new ChangeListener<String>() {  
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                //remove duplicate period
                if(newValue.split("[.]+").length > 2){
                    numberDisplay.setText(oldValue);
                }
            }
        });
    }
}