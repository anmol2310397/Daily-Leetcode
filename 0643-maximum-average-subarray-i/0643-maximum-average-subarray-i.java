class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double maxAvg = Double.NEGATIVE_INFINITY; // Start with the lowest possible value

        // Calculate the sum of the first 'k' elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Initial average for the first window
        maxAvg = (double) sum / k;

        // Sliding window to find the maximum average
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k]; // Slide the window right
            double currentAvg = (double) sum / k; // Calculate the current average
            maxAvg = Math.max(maxAvg, currentAvg); // Update maxAvg if the current is higher
        }

        return maxAvg;
    }
}
