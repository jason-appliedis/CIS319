// TipCalculatorController.java
// Controller that handles calculateButton and tipPercentageSlider events
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class MyTemperatureConverterController 
{
   private final static BigDecimal farSubConstant = new BigDecimal(32);
   private final static BigDecimal farDivConstant = new BigDecimal(9);
   // GUI controls defined in FXML and used by the controller's code
   @FXML
   private Slider degreesSlider;
   @FXML
   private TextField degreesC;
   @FXML
   private TextField degreesF;

   // calculates and displays the tip and total amounts
   private static BigDecimal changeToCelcius(Number sliderVal) {
      BigDecimal numToConvert = new BigDecimal(sliderVal.toString());
      return numToConvert.subtract(farSubConstant).divide(farDivConstant);
   }


   // called by FXMLLoader to initialize the controller
   public void initialize() 
   {
      // listener for changes to degreesSlider's value
      degreesSlider.valueProperty().addListener(
         new ChangeListener<Number>() 
         {
            @Override
            public void changed(ObservableValue<? extends Number> ov, 
               Number oldValue, Number newValue) 
            {   
               //change text fields and convert to Celcius
               degreesF.setText(newValue.toString()); 
               degreesC.setText(changeToCelcius(newValue).toString()); 
            }
         }
      );
   }
}

