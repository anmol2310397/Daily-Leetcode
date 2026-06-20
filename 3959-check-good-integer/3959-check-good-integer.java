class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=sumDig(n);
        int sq=sumSq(n);
        if((sq-sum)>=50)return true;
        else return false;
    }
    public int sumDig(int n){
        int num=n;
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public int sumSq(int n){
        int sum=0;
        while(n>0){
            int last=n%10;
            sum+=last*last;
            n/=10;
        }
        return sum;
    }
}