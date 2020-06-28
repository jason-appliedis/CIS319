import javax.swing.*;
import java.awt.*;


public class BuildCol {
    protected JPanel pannelName;
    protected JLabel labelField;
    protected String LabelValue;
    protected JTextField textField;
    protected Boolean isEditiable;
        //build text panals 
        public BuildCol(JPanel pannelName, JLabel labelField, String LabelValue, JTextField textField, Boolean isEditiable){
            this.pannelName = pannelName;
            this.labelField = labelField;
            this.LabelValue = LabelValue;
            this.textField = textField;
            this.isEditiable = isEditiable;
        
        }

        public JPanel addNewCol(){
            pannelName = new JPanel();

            //create label to display message
            labelField = new JLabel(LabelValue);
                
            //create text field for Fahrenheit temperature
            textField = new JTextField(10);
            textField.setEditable(isEditiable);
            //create layout manager for panel
            pannelName.setLayout(new FlowLayout(FlowLayout.RIGHT));
            
            //add label and text field to panel
            pannelName.add(labelField);
            pannelName.add(textField);
            return pannelName;
        }

        public String getTextField(){
            return textField.getText();
        }

        public void setText(String value){
            textField.setText(value);
        }

            
}
