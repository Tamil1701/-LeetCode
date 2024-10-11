class Solution {
    public String removeTrailingZeros(String num) {
        int len=num.length()-1;
        while(len>=0&&num.charAt(len)=='0'){
            len--;
        }
        String s="";
        for(int i=0;i<=len;i++){
            s=s+num.charAt(i);

        }
        
        return s;
        
    }
}