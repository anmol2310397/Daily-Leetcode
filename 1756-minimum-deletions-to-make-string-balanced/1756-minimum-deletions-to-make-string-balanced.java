class Solution {
    public int minimumDeletions(String s) {
        int countb=0,count=0;
        for(char ch:s.toCharArray()){
            if(ch=='b'){
                countb++;
            }
            else{
                if(countb>0)
                count=Math.min(countb,count+1);
            }
        }
        return count;
    }
}