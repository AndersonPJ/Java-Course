package Class.lesson_11_12_13;

import java.text.DecimalFormat;
import java.util.Locale;

public class ExerciseListQ14 {
	public String timeDownload(double sizeMB, double velocityMbps)
	// returns download time
	{
		velocityMbps /= 8;
		double timeDownload = sizeMB / velocityMbps;
		timeDownload /= 60;

		Locale.setDefault(Locale.ENGLISH);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("#.## minutes");

		System.out.println("The time for full download is: " + df.format(timeDownload));

		return df.format(timeDownload);
	}
}