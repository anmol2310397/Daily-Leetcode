class Solution {
    String encrypt(int x){
        if(x<10)
            return Integer.toString(x);
        int n=x,max=0,count=0;
        while(n>0){
            max=Math.max(max,n%10);
            n/=10;
            count++;
        }
        String s="";
        for(int i=0;i<count;i++){
            s+=Integer.toString(max);
        }
        return s;
    }
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=Integer.parseInt(encrypt(i));
        }
        return sum;
    }
}