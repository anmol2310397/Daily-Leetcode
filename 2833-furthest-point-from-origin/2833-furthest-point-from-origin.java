class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int R=0,L=0,blank=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L')L++;
            if(ch=='R')R++;
            if(ch=='_')blank++;
        }
        return Math.max(Math.abs(R-L+blank),Math.abs(L-R+blank));
    }
}