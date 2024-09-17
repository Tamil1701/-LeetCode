class Solution {
    public int lengthOfLastWord(String s) {
        String s1= s.trim();
        String[] arr = s1.split(" ");
        int len1=arr.length;
        int len2=arr[len1-1].length();
        return len2;
        
    }
}