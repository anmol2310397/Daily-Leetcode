class Solution {
    public int[] sumZero(int n) {
        int ans[]=new int[n];
        int start=n/2;
        if(n%2!=0){
        for(int i=0;i<n;i++){
            ans[i]=start;
            start--;
        }
        }
        else
        {
            for(int i=0;i<n;i++){
                if(start==0){
                    i--;
                    start--;
                }
                else{
                    ans[i]=start;
                    start--;
                }
            }
        }
        return ans;
    }
}