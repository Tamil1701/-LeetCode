class Solution {
    public boolean isPalindrome(int x) {
        String ans= Integer.toString(x);
        int len=ans.length();
        int lent=len-1;
        for(int i=0;i<len/2;i++){
            if(ans.charAt(i)!=ans.charAt(lent)){
                return false;

            }
            lent--;
        }
        return true;
        
    }
}