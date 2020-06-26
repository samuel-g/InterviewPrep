import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {

	TwoSum twoSum;

	@Before
	public void setUp() throws Exception {
		twoSum = new TwoSum();
	}

	@Test
	public void testTwoSums() throws Exception {
		int[] expArr = new int[] { 0, 2 };
		int[] nums = new int[] { 1, 0, 4, 0 };

		assertArrayEquals(expArr, twoSum.twoSum(nums, 5));
	}

	@Test(expected = Exception.class)
	public void testInvalidSum() throws Exception {
		int[] expArr = new int[] { 0, 2 };
		int[] nums = new int[] { 1, 0, 4, 0 };

		assertArrayEquals(expArr, twoSum.twoSum(nums, 6));
	}

}
