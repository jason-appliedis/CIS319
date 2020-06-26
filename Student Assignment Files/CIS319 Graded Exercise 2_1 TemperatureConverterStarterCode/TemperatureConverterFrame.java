import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

//TemperatureConverter class converts Fahrenheit to Celsius
public class TemperatureConverterFrame extends JFrame
{	
	//Build a panel for each section,
	//then add each panel to the JFrame
	//Building individual panels is not required,
	//but it helps to organize things
	private JPanel fahrenheitPanel;			//To hold Fahrenheit text field
	private JPanel celsiusPanel;			//To hold Celsius text field
	private JPanel buttonPanel;				//To hold convert button
	private JTextField fahrenheitTextField;	//Fahrenheit temperature
	private JTextField celsiusTextField;	//Celsius temperature

	//The variable serialVersionUID is not used in this project
	//You can leave it out, but then you will get a warning message
	//that the class TemperatureConverter does not have this variable...
	static final long serialVersionUID = 0;

	public TemperatureConverterFrame()
	{
		super("Temperature Converter");
		
		//build panels
		buildFahrenheitPanel();
		buildCelsiusPanel();
		buildButtonPanel();

		//create layout manager
		setLayout(new GridLayout(3, 1));

		//add panels to frame
		add(fahrenheitPanel);
		add(celsiusPanel);
		add(buttonPanel);
	}//end TemperatureConverterFrame constructor

	//buildFahrenheitPanel creates a panel with a text field
	//for the user to enter a Fahrenheit temperature
	private void buildFahrenheitPanel()
	{
		//create panel
		fahrenheitPanel = new JPanel();

		//create label to display message
		JLabel fahrenheitLabel = new JLabel("Fahrenheit Temperature: ");

		//create text field for Fahrenheit temperature
		fahrenheitTextField = new JTextField(10);

		//create layout manager for panel
		fahrenheitPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

		//add label and text field to panel
		fahrenheitPanel.add(fahrenheitLabel);
		fahrenheitPanel.add(fahrenheitTextField);
	}//end buildFahrenheitPanel method

	//buildCelsiusPanel creates a panel that displays the
	//Celsius temperature in a read-only text field
	private void buildCelsiusPanel()
	{
		//create panel
		celsiusPanel = new JPanel();

		//create label to display message
		JLabel celsiusLabel = new JLabel("Celsius Temperature: ");

		//create read-only text field for the celsius temperature
		celsiusTextField = new JTextField(10);
		celsiusTextField.setEditable(false);

		//create layout manager for the panel
		celsiusPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

		//add label and text field to the panel
		celsiusPanel.add(celsiusLabel);
		celsiusPanel.add(celsiusTextField);
	}//end buildCelsiusPanel method

	//buildButtonPanel creates a panel with a button that
	//converts Fahrenheit temperature to Celsius
	private void buildButtonPanel()
	{
		//create panel
		buttonPanel = new JPanel();

		//create Convert & Exit buttons
		JButton convertButton = new JButton("Convert");
		JButton exitButton = new JButton("Exit");

		//add action listeners to buttons
		convertButton.addActionListener(new ConvertButtonListener());
		exitButton.addActionListener(new ExitButtonListener());

		//add button to panel
		buttonPanel.add(convertButton);
		buttonPanel.add(exitButton);
	}//end buildButtonPanel method

	//private inner class ConvertButtonListener handles convert button click
	private class ConvertButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			double faherenheitTemperature, celsiusTemperature;  //to hold temperatures

			//create DecimalFormat object to format numbers
			DecimalFormat decimalFormatter = new DecimalFormat("0.0");

			//get Fahrenheit temperature and convert to a double
			faherenheitTemperature = Double.parseDouble(fahrenheitTextField.getText());

			//calculate & display Celsius temperature
			celsiusTemperature = (5.0 / 9.0) * (faherenheitTemperature - 32);
			celsiusTextField.setText(decimalFormatter.format(celsiusTemperature));
		}//end actionPerformed method
	}//end class ConvertButtonListener

	//private inner class ExitButtonListener handles exit button click
	private class ExitButtonListener implements ActionListener
	{
		//probably more common in C++, but single line methods may be written like this
		public void actionPerformed(ActionEvent event) { System.exit(0); }
	}//end class ExitButtonListener
}//end class TemperatureConverterFrame