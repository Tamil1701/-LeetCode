class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String B= (str1.length()>str2.length())?str1:str2;
        String S= (str1.length()>str2.length())?str2:str1;
        if(B.equals(S)){
            return S;
        }
        if(!B.startsWith(S)){
            return "";
        }
        else{
            return gcdOfStrings(B.substring(S.length()),S);
        }

    }
}