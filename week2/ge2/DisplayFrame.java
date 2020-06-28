//starting from Fig. 22.3: SliderFrame.java

import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class DisplayFrame extends JFrame
{
	private final JSlider sizeJSlider; //slider to select size
	private final ShapePanel myPanel;  //panel to draw shape
	
	//background color buttons, group, text field, & panel
	private final JRadioButton redBackgroundButton;
	private final JRadioButton blueBackgroundButton;
	private final JRadioButton greenBackgroundButton;
	private final ButtonGroup backgroundColorGroup;
	private final JLabel backgroundColorGroupLabel;
	private final JPanel backgroundColorGroupPanel;

	private final JRadioButton shapeRedBackgroundButton;
	private final JRadioButton shapeBlueBackgroundButton;
	private final JRadioButton shapeGreenBackgroundButton;
	private final ButtonGroup shapeBackgroundColorGroup;
	private final JLabel shapeBackgroundColorGroupLabel;
	private final JPanel shapeColorPanel;

	private final JRadioButton shapeTypeSquare;
	private final JRadioButton shapeTypeCircle;
	private final ButtonGroup shapeTypeBtnGroup;
	private final JLabel shapeTypeLabel;
	private final JPanel shapeTypePanel;


	public DisplayFrame() 
	{
		super("Slider & Radio Button Demo");

		myPanel = new ShapePanel();       //create panel to draw circle
		myPanel.setBackground(Color.RED); //initial color of panel

		// create background color radio buttons, group, & panel
		backgroundColorGroupLabel = new JLabel(" Background ");
		redBackgroundButton = new JRadioButton("Red", true);
		blueBackgroundButton = new JRadioButton("Blue", false);
		greenBackgroundButton = new JRadioButton("Green", false);
		backgroundColorGroup = new ButtonGroup();
			backgroundColorGroup.add(redBackgroundButton);
			backgroundColorGroup.add(blueBackgroundButton);
			backgroundColorGroup.add(greenBackgroundButton);
		backgroundColorGroupPanel = new JPanel();
			backgroundColorGroupPanel.setLayout(new GridLayout(4,1));
			backgroundColorGroupPanel.add(backgroundColorGroupLabel);
			backgroundColorGroupPanel.add(redBackgroundButton);
			backgroundColorGroupPanel.add(blueBackgroundButton);
			backgroundColorGroupPanel.add(greenBackgroundButton);

		//background color radio button listeners
		redBackgroundButton.addActionListener(new ActionListener()
			{public void actionPerformed(ActionEvent e) {myPanel.setBackground(Color.RED);}});
		blueBackgroundButton.addActionListener(new ActionListener()
			{public void actionPerformed(ActionEvent e) {myPanel.setBackground(Color.BLUE);}});
		greenBackgroundButton.addActionListener(new ActionListener()
			{public void actionPerformed(ActionEvent e) {myPanel.setBackground(Color.GREEN);}});
		
		
		
		
			// create background color radio buttons, group, & panel
		shapeBackgroundColorGroupLabel = new JLabel(" Forground ");
		shapeRedBackgroundButton = new JRadioButton("Red", true);
		shapeBlueBackgroundButton = new JRadioButton("Blue", false);
		shapeGreenBackgroundButton = new JRadioButton("Green", false);
		shapeBackgroundColorGroup = new ButtonGroup();
			shapeBackgroundColorGroup.add(shapeRedBackgroundButton);
			shapeBackgroundColorGroup.add(shapeBlueBackgroundButton);
			shapeBackgroundColorGroup.add(shapeGreenBackgroundButton);
		shapeColorPanel = new JPanel();
		shapeColorPanel.setLayout(new GridLayout(4,1));
			shapeColorPanel.add(shapeBackgroundColorGroupLabel);
			shapeColorPanel.add(shapeRedBackgroundButton);
			shapeColorPanel.add(shapeBlueBackgroundButton);
			shapeColorPanel.add(shapeGreenBackgroundButton);
	
			//background color radio button listeners
		shapeRedBackgroundButton.addActionListener(new ActionListener()
			{public void actionPerformed(ActionEvent e) {myPanel.setForeground(Color.RED);}});
		shapeBlueBackgroundButton.addActionListener(new ActionListener()
			{public void actionPerformed(ActionEvent e) {myPanel.setForeground(Color.BLUE);}});
		shapeGreenBackgroundButton.addActionListener(new ActionListener()
			{public void actionPerformed(ActionEvent e) {myPanel.setForeground(Color.GREEN);}});


		//set up the north boundry 
		shapeTypeLabel = new JLabel(" Shape Type ");
		shapeTypeSquare = new JRadioButton("Square", true);
		shapeTypeCircle = new JRadioButton("Circle", false);
		shapeTypeBtnGroup = new ButtonGroup();
		shapeTypeBtnGroup.add(shapeTypeSquare);
		shapeTypeBtnGroup.add(shapeTypeCircle);
		shapeTypePanel = new JPanel();
		shapeTypePanel.setLayout(new GridLayout(0,3));
		shapeTypePanel.add(shapeTypeLabel);
		shapeTypePanel.add(shapeTypeSquare);
		shapeTypePanel.add(shapeTypeCircle);
		shapeTypeSquare.addActionListener(new ActionListener()
			{public void actionPerformed(ActionEvent e) {
				myPanel.setShape(true);
			}});
		shapeTypeCircle.addActionListener(new ActionListener()
			{public void actionPerformed(ActionEvent e) {
				myPanel.setShape(false);
			}});

		//set up JSlider to control size value
		sizeJSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 410, 10);
		sizeJSlider.setMajorTickSpacing(10); //create tick every 10
		sizeJSlider.setPaintTicks(true);     //paint ticks on slider

		//JSlider event listener
		sizeJSlider.addChangeListener(new ChangeListener() // anonymous inner class
		{	@Override
			public void stateChanged(ChangeEvent e) {myPanel.setSize(sizeJSlider.getValue());}
		}); 

		//add widgets to DisplayFrame
		add(sizeJSlider, BorderLayout.SOUTH);
		add(backgroundColorGroupPanel, BorderLayout.WEST);
		add(myPanel, BorderLayout.CENTER);
		add(shapeColorPanel, BorderLayout.EAST);
		add(shapeTypePanel, BorderLayout.NORTH);
	}//end DisplayFrame constructor
}//end class DisplayFrame

/**************************************************************************
* (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
* Pearson Education, Inc. All Rights Reserved.                           *
*                                                                        *
* DISCLAIMER: The authors and publisher of this book have used their     *
* best efforts in preparing the book. These efforts include the          *
* development, research, and testing of the theories and programs        *
* to determine their effectiveness. The authors and publisher make       *
* no warranty of any kind, expressed or implied, with regard to these    *
* programs or to the documentation contained in these books. The authors *
* and publisher shall not be liable in any event for incidental or       *
* consequential damages in connection with, or arising out of, the       *
* furnishing, performance, or use of these programs.                     *
*************************************************************************/