class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int min=nums.length;
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            int num=reverse(nums[i]);
            if(map.containsKey(num))
                min=Math.min(min,Math.abs(i-map.get(num)));
             map.put(nums[i],i);
        }
        return min==nums.length?-1:min;
    }
    int reverse(int num){
        int n=num;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n/=10;
        }
        return rev;
    }
}