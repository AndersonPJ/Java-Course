package Class.lesson_11_12_13;

import java.text.DecimalFormat;
import java.util.Locale;

public class ExerciseListQ10 {
	public String celsiusToFahrenheit(double degreeCelsius)
	// returns temperature in degrees Fahrenheit
	{
		double degreeFahrenheit = ((degreeCelsius * 9) / 5) + 32;

		Locale.setDefault(Locale.ENGLISH);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.## °F");

		System.out.println("The temperature in degrees Fahrenheit is: " + df.format(degreeFahrenheit));

		return df.format(degreeFahrenheit);
	}
}