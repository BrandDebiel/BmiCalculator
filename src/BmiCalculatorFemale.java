
public class BmiCalculatorFemale extends BmiCalculator 
{

	double m_BmiValue = 0;
	int lowBmiLimit = 19;
	int highBmiLimit = 24;
	
	public BmiCalculatorFemale() 
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
		return "19 - 24";
	}
	
	public String getAdvisedWeight()
	{
		return calculateWeightAdvise();
	}

}
