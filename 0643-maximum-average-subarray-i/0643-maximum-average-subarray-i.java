class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        double maxAverage = Integer.MIN_VALUE;
        for (int i = 0; i <= len - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            double average = (double) sum / k;
            maxAverage = Math.max(maxAverage, average);
        }
        return maxAverage;
    }
}
