package Class.lesson_11_12_13;

import java.text.DecimalFormat;
import java.util.Locale;

public class ExerciseListQ11 {
	public String[] answers(double number1, double number2, double number3)
	// returns answers
	{
		double answerA = (number1 * 2) + (number2 / 2);
		double answerB = (number1 * 3) + number3;
		double answerC = Math.pow(number3, 3);

		Locale.setDefault(Locale.ENGLISH);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.##");

		System.out.println("Answer A: " + df.format(answerA));
		System.out.println("Answer B: " + df.format(answerB));
		System.out.println("Answer C: " + df.format(answerC));

		return new String[] {df.format(answerA), df.format(answerB), df.format(answerC)};
	}
}