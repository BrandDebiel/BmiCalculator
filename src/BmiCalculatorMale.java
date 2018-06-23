
public class BmiCalculatorMale extends BmiCalculator 
{

	double m_BmiValue = 0;
	int lowBmiLimit = 20;
	int highBmiLimit = 25;
	
	public BmiCalculatorMale() 
	{
		
	}
	
	public String getBmiValue(double bodyWeightKg, double bodyLengthCm)
	{
		m_BmiValue = calculateBmiValue(bodyWeightKg, bodyLengthCm);
		

		
		return decimalFormat.format(m_BmiValue); 
	}
	
	public String getBmiAdvice()
	{

		return 	calculateBmiAdvice(lowBmiLimit, highBmiLimit);
	}
	
	public String getNormalBmi() 
	{
		return "20 - 25";
	}
	
	public String getAdvisedWeight()
	{
		return calculateWeightAdvise();
	}
	

}