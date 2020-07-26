//starting from Fig. 22.2: OvalPanel.java

import java.awt.Graphics;
import javax.swing.JPanel;

public class ShapePanel extends JPanel
{
	private int size = 10; //default size
	private Boolean isSquare = true; //default shape
	// draw a shape of the specified size
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(isSquare){
			g.fillRect(10, 10, size, size);
		}else{
			g.fillOval(10, 10, size, size);
		}		
	}//end paintComponent

	// validate and set size, then repaint
	public void setSize(int newSize)
	{
		size = (newSize >= 0 ? newSize : 10);
		repaint(); //repaint panel
	}
	public void setColor(){
		
	}

	public void setShape(Boolean bool) {
		this.isSquare = bool;
		repaint();
	}
}
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