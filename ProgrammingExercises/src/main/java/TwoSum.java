/**
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target. You may assume that each input would have
 * exactly one solution, and you may not use the same element twice. 
 * Given nums = [0, 1, 6, 4], target = 7, 
 * Because nums[1] + nums[2] = 1 + 6 = 7, return [1, 2].
 *
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) throws Exception {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (target == nums[i] + nums[j]) {
					return new int[] { i, j };
				}
			}
		}
		throw new Exception("No two numbers add upto target");
	}
}
