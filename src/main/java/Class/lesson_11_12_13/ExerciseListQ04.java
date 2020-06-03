package Class.lesson_11_12_13;

import java.text.DecimalFormat;
import java.util.Locale;

public class ExerciseListQ04 {
	public String mean(double note1, double note2, double note3, double note4)
	// returns mean of the informed numbers
	{
		double mean = (note1 + note2 + note3 + note4) / 4;

		Locale.setDefault(Locale.ENGLISH);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.0#");

		System.out.println("The mean is equivalent to: " + df.format(mean));

		return df.format(mean);
	}
}