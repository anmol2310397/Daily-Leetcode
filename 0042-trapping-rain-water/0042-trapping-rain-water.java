class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int maxLeft=height[0],maxRight=height[n-1];
        int maxR[]=new int[n];
        for(int i=n-1;i>0;i--){
            maxRight=Math.max(maxRight,height[i]);
            maxR[i]=maxRight;
        }
        int sum=0;
        for(int i=1;i<n-1;i++){
            int currH=height[i];
            maxLeft=Math.max(maxLeft,height[i-1]);
            int min=Math.min(maxLeft,maxR[i]);
            int diff=min-currH;
            if(diff>0){
                sum+=diff;
            }
        }
        return sum;

    }
}