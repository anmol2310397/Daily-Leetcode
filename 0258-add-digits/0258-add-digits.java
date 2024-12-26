class Solution {
    public int add(int n){
        int n1=n,sum=0;
        while(n1>0){
            sum+=n1%10;
            n1/=10;
        }
        return sum;
    }
    public int addDigits(int num) {
        if(num<9)
            return num;
        int ans=add(num);
        while(ans>9){
        ans=add(ans);
        }
        return ans;
    }
}