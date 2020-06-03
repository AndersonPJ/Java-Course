package Class.lesson_11_12_13;

import java.text.DecimalFormat;
import java.util.Locale;

public class ExerciseListQ08 {
	public String salary(double gainHour, double hoursMonth)
	// returns salary
	{
		double salary = gainHour * hoursMonth;

		Locale.setDefault(Locale.ENGLISH);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("R$ 0.00");

		System.out.println("The salary is equivalent to: " + df.format(salary));

		return df.format(salary);
	}
}