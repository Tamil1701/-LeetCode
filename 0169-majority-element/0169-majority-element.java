class Solution {
    public int majorityElement(int[] nums) {
        int max_count=0;
        int most_repeated_number=0;
        for(int i=0;i<nums.length;i++){
            int cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cnt=cnt+1;
                }
            }
            if(cnt>max_count){
                max_count=cnt;
                most_repeated_number=nums[i];

            }
            if(max_count>(nums.length/2)){
                return most_repeated_number;
            }
        }
        return most_repeated_number;
    }
}