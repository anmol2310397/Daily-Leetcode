class Solution {
    public String largestOddNumber(String num) {
        char ch[]=num.toCharArray();
        int len=ch.length;
        for(int i=len-1;i>=0;i--){
            if((ch[i]-'0')%2!=0)
            return num.substring(0,i+1);
        }
        return "";
    }
}