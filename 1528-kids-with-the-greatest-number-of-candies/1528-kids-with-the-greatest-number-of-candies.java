class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n= candies.length;
        List<Boolean> result=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            int cn=candies[i]+extraCandies;
            Boolean can=true;
            for(int j=0;j<n;j++){
                if(cn<candies[j]){
                    can=false;
                    break;
                }
            }
            result.add(can);
        }
        return result;
        
    }
}