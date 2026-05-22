class Solution {
    public int countKthRoots(int l, int r, int k) {
        if(r==0&&l==0)return 1;
        if(k==1){
            return r-l+1;
        }
        int sum=1,i=0;
        int count=0;
        while(sum<=r){
            int p=(int)Math.pow(i,k);
            sum=p;
            i++;
            if(sum>=l&&sum<=r)
            count++;
        }
        return count;
    }
}