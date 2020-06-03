package Class.lesson_11_12_13;

import java.text.DecimalFormat;
import java.util.Locale;

public class ExerciseListQ07 {
	public String[] areaAndArea2(double side)
	// returns areas
	{
		double squareSide = Math.pow(side, 2);
		double squareSide2 = squareSide * 2;

		Locale.setDefault(Locale.ENGLISH);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.##");

		System.out.println("The value of the square area is equivalent to: "  + df.format(squareSide));
		System.out.println("The double of the square area is equivalent to: " + df.format(squareSide2));

		return new String[] {df.format(squareSide), df.format(squareSide2)};
	}
}