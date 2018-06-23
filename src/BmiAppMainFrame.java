/*
 * Developer: Dennis van der Vlugt
 * Studentnumber: 418679
 * 
 * HogeSchool InHolland
 * 
 * Java 2
 * 
 * "BMI calculator" 
 * 
 */

import javax.swing.JFrame;

/*
 * Class: BmiUserInterfacePanel
 * 
 * Creates main application frame 
 * 
 */

public class BmiAppMainFrame extends JFrame 
{
	
	private BmiUserInterfacePanel m_BmiUserInterface;
	
	public BmiAppMainFrame()
	{
		m_BmiUserInterface = new BmiUserInterfacePanel();
		setContentPane(m_BmiUserInterface);
	}
	
	public static void main(String args[])
	{
		JFrame mainFrame = new BmiAppMainFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setTitle("BMI Calculator");
		mainFrame.setSize(300,200);
		mainFrame.setVisible(true);
	}	

}