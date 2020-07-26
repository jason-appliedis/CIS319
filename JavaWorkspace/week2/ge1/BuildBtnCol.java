import javax.swing.*;

public class BuildBtnCol{
	public JButton convertButton;
	public JButton exitButton;
    public BuildBtnCol(){}

    JPanel buildButtonPanel(){
		//create panel
		JPanel buttonPanel = new JPanel();

		//create Convert & Exit buttons
		this.convertButton = new JButton("Convert");
		this.exitButton = new JButton("Exit");

		//add button to panel
		buttonPanel.add(convertButton);
        buttonPanel.add(exitButton);
        
        return buttonPanel;
    }
}