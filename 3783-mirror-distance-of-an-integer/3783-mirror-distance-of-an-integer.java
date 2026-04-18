class Solution {
    public int mirrorDistance(int n) {
        int rev=reverse(n);
        return Math.abs(n-rev);
    }
    int reverse(int num){
        int n=num;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}