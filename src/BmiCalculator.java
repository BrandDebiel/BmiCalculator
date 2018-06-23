import static java.lang.Math.sqrt;

import java.math.RoundingMode;
import java.text.DecimalFormat;


public class BmiCalculator {
	
	double m_Weight = 0;
	double m_Length = 0;
	double m_LowBmiLimit = 0;
	double m_HighBmiLimit = 0;
	double m_BmiValue = 0;
	
	DecimalFormat decimalFormat;
	
	
	protected BmiCalculator()
	{
		decimalFormat = new DecimalFormat("#.##");
		decimalFormat.setRoundingMode(RoundingMode.CEILING);
	}
	
	protected double calculateBmiValue(double bodyWeightKg, double bodyLengthCm)
	{
		
		m_Weight = bodyWeightKg;
		m_Length = bodyLengthCm;
		m_BmiValue = bodyWeightKg/ ((bodyLengthCm /100) * (bodyLengthCm /100));
		
		
		return m_BmiValue;
	}
	
	protected String calculateBmiAdvice(int lowBmiLimit, int highBmiLimit)
	{
		m_LowBmiLimit = lowBmiLimit;
		m_HighBmiLimit = highBmiLimit;
		
		if(m_BmiValue < lowBmiLimit)
		{
			return "BMI to low!";
		}
		else if(m_BmiValue > highBmiLimit)
		{
			return "BMI to high!";
		}
		else
		{
			return "BMI is OK";
		}		
	}
	
	protected String calculateWeightAdvise()
	{
		double minimumWeight;
		double maximumWeight;
		
		minimumWeight = sqrt(m_Length * m_LowBmiLimit);
		maximumWeight = sqrt(m_Length * m_HighBmiLimit);
		
        StringBuilder sb = new StringBuilder();
        sb.append(decimalFormat.format(minimumWeight));
        sb.append(" - ");
        sb.append(decimalFormat.format(maximumWeight));
        String message = sb.toString();
        
        return message;
	}
}
