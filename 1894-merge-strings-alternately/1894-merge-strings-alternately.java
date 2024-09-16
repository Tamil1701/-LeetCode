class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a=word1.length();
        int b=word2.length();
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<a || i<b){
            if(i<a){
                sb.append(word1.charAt(i));
            }
            if(i<b){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
        
    }
}