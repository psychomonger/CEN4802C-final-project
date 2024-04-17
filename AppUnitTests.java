/***********************************************************************
 * George E. Mitchell
 * 202420 Software Integration, Configuration, and Testing CEN-4802C-24676
 * Final Project
 * 
 * This application prints some simple arithmetic calculations to the console.
***********************************************************************/
package package1;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AppUnitTests {
	
	@Test
	@DisplayName("Executing test of square method.")
	// Test of square method.
	public void squareTest() {
		int output_f = App.square(4);
		assertEquals(16, output_f);
	}

	@Test
	@DisplayName("Executing test of sum method.")
	// Test of sum method.
	public void sumTest() {
		int output_f = App.sum(4, 5);
		assertEquals(9, output_f);
	}
	
	@Test
	@DisplayName("Executing test of difference method.")
	// Test of difference method.
	public void differenceTest() {
		int output_f = App.difference(6, 3);
		assertEquals(3, output_f);
	}
	
}
