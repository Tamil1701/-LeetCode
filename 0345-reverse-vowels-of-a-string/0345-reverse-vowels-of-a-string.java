class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        int pt = 0;
        char[] st = new char[len]; 
    
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                st[pt] = ch;
                pt++;
            }
        }
        
        
        pt=pt-1;

        
        for (int i = 0; i < len; i++) {
            char cd = s.charAt(i);
            if (cd == 'a' || cd == 'e' || cd == 'i' || cd == 'o' || cd == 'u' || 
                cd == 'A' || cd == 'E' || cd == 'I' || cd == 'O' || cd == 'U') {
                sb.append(st[pt]); 
                pt--;
            } else {
                sb.append(cd); 
            }
        }
        
        return sb.toString();
    }
}
