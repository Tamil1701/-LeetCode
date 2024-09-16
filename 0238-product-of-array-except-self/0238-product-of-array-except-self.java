class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] answer=new int[len];
        int total=1;
        for(int i=0;i<len;i++){
            total=total*nums[i];
        }
        for(int j=0;j<len;j++){
            if(nums[j]!=0){
                answer[j]=total/nums[j];
            }
            else{
                int mul=1;
                for(int k=0;k<len;k++){
                    if(k!=j){
                        
                        mul*=nums[k];
                    }
                }
                answer[j]=mul;


            }
        }






        // for(int i=0;i<len;i++){
        //     int mul=1;
        //     for(int j=0;j<len;j++){
        //         if(j!=i){
        //             mul=mul*nums[j];
        //         }
        //     }
        //     answer[i]=mul;
        // }
        return answer;
        
    }
}