package TestClass.lesson_10;

import Class.lesson_10.Variable;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;


public class Variable_Test {
	@Test
	public void testTrue() {
		try {
			boolean expected = true;
			boolean actual = new Variable().joke();

			assertEquals(expected, actual);			
		} catch (Exception e) {
			System.err.println("Test failure!");
			fail();
		}
	}
}