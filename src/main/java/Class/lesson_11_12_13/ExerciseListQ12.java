package Class.lesson_11_12_13;

import java.text.DecimalFormat;
import java.util.Locale;

public class ExerciseListQ12 {
	public String idealWeight(double height)
	// returns the ideal weight
	{
		double idealWeight = (72.7 * height) - 58;

		Locale.setDefault(Locale.ENGLISH);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.## Kg");

		System.out.println("Your ideal weight is: " + df.format(idealWeight));

		return df.format(idealWeight);
	}
}