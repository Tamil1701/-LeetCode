class Solution {
    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
      
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
      
        for (int i = 0; i < nums.length; i++) {
            int sumRight = totalSum - sumLeft - nums[i];
          
            if (sumLeft == sumRight) {
                return i;
            }

            sumLeft += nums[i];
        }
      
        return -1;
        
    }
}