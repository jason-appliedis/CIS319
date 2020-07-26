package week3.ge2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class MyTemperatureConverterController 
{
   private final static BigDecimal farSubConstant = new BigDecimal(32);
   private final static BigDecimal farDivConstant = new BigDecimal(9);
   private final static BigDecimal farMultConstant = new BigDecimal(5);
   // GUI controls defined in FXML and used by the controller's code
   @FXML
   private TextField degreesF;

   @FXML
   private Slider degreesSlider;

   @FXML
   private TextField degreesC;

   // calculates and displays the tip and total amounts
   private static BigDecimal changeToCelcius(final Number sliderVal) {
       final BigDecimal numToConvert = new BigDecimal(sliderVal.toString());
       return numToConvert.subtract(farSubConstant).multiply(farMultConstant).divide(farDivConstant, RoundingMode.HALF_UP);
   }

   // called by FXMLLoader to initialize the controller
   public void initialize() {
       // listener for changes to degreesSlider's value
       degreesSlider.snapToTicksProperty();
       degreesSlider.valueProperty().addListener(new ChangeListener<Number>() {
      
           @Override
           public void changed(final ObservableValue<? extends Number> ov, final Number oldValue,
                   final Number newValue) 
            { 
               //change text fields and convert to Celcius
               Integer newValueAsInt = newValue.intValue();
               degreesF.setText(newValueAsInt.toString()); 
               degreesC.setText(changeToCelcius(newValueAsInt).setScale(0, RoundingMode.CEILING).toString()); 
            }
         }
      );
   }
}
