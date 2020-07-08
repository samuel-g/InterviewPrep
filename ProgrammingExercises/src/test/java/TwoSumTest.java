import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {

	

	@Test
	public void testTwoSums() throws Exception {
		int[] expArr = new int[] { 0, 2 };
		int[] nums = new int[] { 1, 0, 4, 0 };
		assertArrayEquals(expArr, new TwoSum().twoSum(nums, 5));
	}

	@Test(expected = Exception.class)
	public void testInvalidSum() throws Exception {
		int[] expArr = new int[] { 0, 2 };
		int[] nums = new int[] { 1, 0, 4, 0 };
		assertArrayEquals(expArr, new TwoSum().twoSum(nums, 6));
	}

}
