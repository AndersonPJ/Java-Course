package Class.lesson_11_12_13;

import java.text.DecimalFormat;
import java.util.Locale;

public class ExerciseListQ06 {
	public String area(double radius)
	// returns area
	{
		double area = Math.PI * Math.pow(radius, 2);

		Locale.setDefault(Locale.ENGLISH);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.##");

		System.out.println("The area is: " + df.format(area));

		return df.format(area);
	}
}