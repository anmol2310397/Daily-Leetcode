import java.util.Arrays;

class Solution {
    public String triangleType(int[] nums) {
        if (nums.length != 3) {
            throw new IllegalArgumentException("Input must contain exactly 3 elements.");
        }
        Arrays.sort(nums);
        if (nums[0] <= 0 || nums[0] + nums[1] <= nums[2]) {
            return "none";
        }
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        } else if (nums[0] == nums[1] || nums[1] == nums[2]) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
