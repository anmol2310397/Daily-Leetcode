class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=1;i<s.length();i++){
            char ch1=s.charAt(i-1);
            char ch2=s.charAt(i);
            if(Math.abs(ch1-ch2)>2)
            return false;
        }
        return true;
    }
}