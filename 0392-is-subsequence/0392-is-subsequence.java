class Solution {
    public boolean isSubsequence(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int pt = 0; 

        if (len1 == 0) {
            return true;
        }

        
        for (int i = 0; i < len2; i++) {
            
            if (s.charAt(pt) == t.charAt(i)) {
                pt++;
            }
            
            if (pt == len1) {
                return true;
            }
        }
        return false;
    }
}
