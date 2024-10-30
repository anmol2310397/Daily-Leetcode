class Solution {
    public int largestAltitude(int[] gain) {
        int high=gain[0];
        for(int i=1;i<gain.length;i++){
            gain[i]+=gain[i-1];
            high=Math.max(high,gain[i]);
        }
        if(high>0)return high;
        else return 0;
    }
}