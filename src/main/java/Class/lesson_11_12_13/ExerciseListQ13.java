package Class.lesson_11_12_13;

import java.text.DecimalFormat;
import java.util.Locale;

public class ExerciseListQ13 {
	static double IR = 0.11, INSS = 0.08, syndicate = 0.05;

	public String[] salaryAndTax(double gainHour, double hoursMonth)
	// returns salary and taxes
	{
		double grossSalary = gainHour * hoursMonth;
		double costINSS = grossSalary * INSS;
		double syndicateCost = grossSalary * syndicate;
		double liquidSalary = grossSalary - (grossSalary * IR) - costINSS - syndicateCost;

		Locale.setDefault(Locale.ENGLISH);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("R$ 0.00");

		System.out.println("The gross salary is: " + df.format(grossSalary));
		System.out.println("The INSS value is: " + df.format(costINSS));
		System.out.println("The syndicate value is: " + df.format(syndicateCost));
		System.out.println("The net salary is: " + df.format(liquidSalary));

		return new String[] {df.format(grossSalary), df.format(costINSS), df.format(syndicateCost), df.format(liquidSalary)};
	}
}