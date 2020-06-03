package Class.lesson_11_12_13;

import java.text.DecimalFormat;
import java.util.Locale;

public class ExerciseListQ02 {
	public String infoNumber(double number)
	// returns number informed
	{
		Locale.setDefault(Locale.ENGLISH);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.##");

		System.out.println("The number informed was " + df.format(number));

		return df.format(number);
	}
}