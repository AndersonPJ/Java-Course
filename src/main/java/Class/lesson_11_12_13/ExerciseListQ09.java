package Class.lesson_11_12_13;

import java.text.DecimalFormat;
import java.util.Locale;

public class ExerciseListQ09 {
	public String fahrenheitToCelsius(double degreeFahrenheit)
	// returns temperature in degrees Celsius
	{
		double degreeCelsius = (5 * (degreeFahrenheit - 32) / 9);

		Locale.setDefault(Locale.ENGLISH);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.## °C");

		System.out.println("The temperature in degrees Celsius is: " + df.format(degreeCelsius));

		return df.format(degreeCelsius);
	}
}