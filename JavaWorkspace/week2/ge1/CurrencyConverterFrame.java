import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class CurrencyConverterFrame extends JFrame {
   
    /**
     *
     */
    private static final long serialVersionUID = -2901430695952938304L;
    // objects for the pannels
    private BuildCol dollars;
    private BuildCol conversion;
    private BuildCol dracs;
    
    public CurrencyConverterFrame(){
        super("Currency Converter");

            //build panels
            this.dollars =  new BuildCol(new JPanel(), new JLabel(), "Dollars", new JTextField(), true);
            this.conversion = new BuildCol(new JPanel(), new JLabel(), "Conversion Rate", new JTextField(), true);
            this.dracs = new BuildCol(new JPanel(), new JLabel(), "Dracs", new JTextField(), false);
            
            BuildBtnCol buttonPanel = new BuildBtnCol();

            //create layout manager
            setLayout(new GridLayout(0, 1));

            //add panels to frame
            add(dollars.addNewCol());
            add(conversion.addNewCol());
            add(dracs.addNewCol());
            add(buttonPanel.buildButtonPanel());


            //add action listeners to buttons
		buttonPanel.convertButton.addActionListener(new ConvertButtonListener());
		buttonPanel.exitButton.addActionListener(new ExitButtonListener());
        
    }

    private class ConvertButtonListener  implements ActionListener 
	{
		public void actionPerformed(ActionEvent event){
			double dollarAmount, conversionAmount; 

			dollarAmount = Double.parseDouble(dollars.getTextField());
            conversionAmount = Double.parseDouble(conversion.getTextField());
            //write value to text field object
            dracs.setText(calculateConversion(dollarAmount, conversionAmount));	
		}
	}
	
	private class ExitButtonListener implements ActionListener
	{
		//probably more common in C++, but single line methods may be written like this
		public void actionPerformed(ActionEvent event) { System.exit(0); }
	}//end class ExitButtonListener
    

    public String calculateConversion(double amount, double conversionRate){
        //format the strings into numbers 
        DecimalFormat decimalFormatter = new DecimalFormat("0.00");
        String formattedResult = decimalFormatter.format(amount * conversionRate);
        return formattedResult;
    }

}


