import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	private FizzBuzz fizzBuzz;

	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void testPrintFizzBuzzForMutiplesOfThree() {
		assertEquals("Fizz", fizzBuzz.printFizzBuzz(3));
	}

	@Test
	public void testPrintFizzBuzzForMutiplesOfFive() {
		assertEquals("Buzz", fizzBuzz.printFizzBuzz(5));
	}

	@Test
	public void testPrintFizzBuzzForMutiplesOfThreeandFive() {
		assertEquals("FizzBuzz", fizzBuzz.printFizzBuzz(15));
	}
	
	@Test
	public void testPrintFizzBuzzForNotMultiplesofThreeandFive() {
		assertEquals("1", fizzBuzz.printFizzBuzz(1));
	}

}
