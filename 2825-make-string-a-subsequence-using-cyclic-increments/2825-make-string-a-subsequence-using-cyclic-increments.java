class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0,j=0;
        int len1=str1.length(),len2=str2.length();
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        while(i<len1 && j<len2){
            if(ch1[i]==ch2[j] | ((ch1[i]+1-'a')%26 +'a')==ch2[j]){
                i++;
                j++;
            }
            else
                i++;
        }
        return j==len2;
    }
}