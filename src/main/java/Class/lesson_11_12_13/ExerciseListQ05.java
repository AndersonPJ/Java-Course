package Class.lesson_11_12_13;

import java.text.DecimalFormat;
import java.util.Locale;

public class ExerciseListQ05 {
	public String[] metersAndCentimeters(double meters)
	// returns meters and its value in centimeters formatted
	{
		double centimeters = meters * 100;

		Locale.setDefault(Locale.ENGLISH);
		DecimalFormat df1 = new DecimalFormat();
		DecimalFormat df2 = new DecimalFormat();
		df1.applyPattern("0.## m");
		df2.applyPattern("0 cm");

		System.out.println("The value in meters is equivalent to: " + df1.format(meters));
		System.out.println("The value in centimeters is equivalent to: " + df2.format(centimeters));

		return new String[] {df1.format(meters), df2.format(centimeters)};
	}
}