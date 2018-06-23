import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BmiUserInterfacePanel extends JPanel implements ActionListener
{
	JLabel lengthLabel;
	JLabel weightLabel;
	JLabel calculatedBmiLabel;
	JLabel calculatedBmiResultLabel;	
	JLabel advisedBmiLabel;
	JLabel advisedBmiResultLabel;
	JLabel normalBmiLabel;
	JLabel normalBmiResultLabel;
	JLabel advisedWeightLabel;
	JLabel advisedWeightResultLabel;
	JButton calculateMaleButton;
	JButton calculateFemaleButton;
	JTextField lengthTextField;
	JTextField weightTextField;
	
	BmiCalculatorMale m_BmiCalculatorMale;
	BmiCalculatorFemale m_BmiCalculatorFemale;

	public BmiUserInterfacePanel()
	{
		lengthLabel = new JLabel("Length (cm):");
		weightLabel = new JLabel("Weight (kg):");
		calculatedBmiLabel = new JLabel("Calculated BMI:");
		calculatedBmiResultLabel = new JLabel("");
		advisedBmiLabel = new JLabel("Advise BMI:");
		advisedBmiResultLabel = new JLabel("");
		normalBmiLabel = new JLabel("Normal BMI:");
		normalBmiResultLabel = new JLabel("");
		advisedWeightLabel = new JLabel("Advised weight:");
		advisedWeightResultLabel = new JLabel("");
		calculateMaleButton = new JButton("Male");
		calculateFemaleButton = new JButton("Female");
		lengthTextField = new JTextField();
		weightTextField = new JTextField();
		
		m_BmiCalculatorMale = new BmiCalculatorMale();
		m_BmiCalculatorFemale = new BmiCalculatorFemale();
		
		setLayout(new GridLayout(8,2));
		
		add(lengthLabel);
		add(lengthTextField);
		add(weightLabel);
		add(weightTextField);
		add(calculatedBmiLabel);
		add(calculatedBmiResultLabel);
		add(advisedBmiLabel);
		add(advisedBmiResultLabel);
		add(normalBmiLabel);
		add(normalBmiResultLabel);
		add(advisedWeightLabel);
		add(advisedWeightResultLabel);
		add(calculateMaleButton);
		add(calculateFemaleButton);
	
		lengthTextField.setText("0");
		weightTextField.setText("0");		
		
		calculateMaleButton.addActionListener(this);
		calculateFemaleButton.addActionListener(this);
		
	}
	
	
	public void actionPerformed(ActionEvent eventSource)
	{
		
		String bmi = "";
		String advisedBmi = "";
		String normalBmi = "";
		String advisedWeight = "";
		
		double length;
		double weight;		
		
		length = Double.parseDouble(lengthTextField.getText());
		weight = Double.parseDouble(weightTextField.getText());
		
		if(length <= 0 | weight <= 0)
		{
			return;
		}

		
		if(eventSource.getSource() == calculateMaleButton)
		{
			bmi = m_BmiCalculatorMale.getBmiValue(weight, length);
			advisedBmi = m_BmiCalculatorMale.getBmiAdvice();
			normalBmi = m_BmiCalculatorMale.getNormalBmi();
			advisedWeight = m_BmiCalculatorMale.getAdvisedWeight();
		}
		if(eventSource.getSource() == calculateFemaleButton)
		{
			bmi = m_BmiCalculatorFemale.getBmiValue(weight, length);
			advisedBmi = m_BmiCalculatorFemale.getBmiAdvice();
			normalBmi = m_BmiCalculatorFemale.getNormalBmi();
			advisedWeight = m_BmiCalculatorFemale.getAdvisedWeight();

		}

		calculatedBmiResultLabel.setText(bmi);
		advisedBmiResultLabel.setText(advisedBmi);
		advisedWeightResultLabel.setText(advisedWeight + " kg");
		normalBmiResultLabel.setText(normalBmi);
		

	}	
	
}
