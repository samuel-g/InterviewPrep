import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BestAverageGradeTest {

	BestAverageGrade bestAverageGrade;

	@Before
	public void setUp() throws Exception {
		bestAverageGrade = new BestAverageGrade();
	}

	@Test
	public void bestAverageGradeTest() throws Exception {
		int bestAverage = bestAverageGrade.bestAverageGrade(new String[][] { 
			{ "Sam", "90" }, 
			{ "John", "80" },
			{ "Sam", "95" }, 
			{ "John", "90" }, 
			{ "Sam", "100" }, 
			{ "John", "80" } });
		assertEquals(95, bestAverage);
	}

	@Test
	public void bestAverageGradeTestifEmptyArray() throws Exception {
		int bestAverage = bestAverageGrade.bestAverageGrade(new String[][] {});
		assertEquals(0, bestAverage);
	}

	@Test(expected = Exception.class)
	public void bestAverageGradeTestInvalidScores() throws Exception {
		int bestAverage = bestAverageGrade.bestAverageGrade(new String[][] { 
			{ "Sam", "90" }, 
			{ "John", "80" },
			{ "Sam", "95" }, 
			{ "John", "90" }, 
			{ "Sam", "1000" }, 
			{ "John", "80" }});
		assertEquals(95, bestAverage);
	}

}
