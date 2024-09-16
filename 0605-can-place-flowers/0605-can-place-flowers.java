class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len=flowerbed.length;
        int count=0;
        for(int head=0;head<len ;head++){
            if(flowerbed[head]==0){
            int prev=(head==0)?0:flowerbed[head-1];
            int follow=(head==len-1)?0:flowerbed[head+1];
            if(prev==0&&follow==0){
                flowerbed[head]=1;
                count++;
            }


        }}
        return count>=n;
        
   
    }
}