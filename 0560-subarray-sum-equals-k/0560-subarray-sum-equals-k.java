class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=nums[i]+prefix[i-1];
        }
        
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            
            for(int j=i;j<nums.length;j++)
            {
               if (i==0){
                   if (prefix[j]==k){
                       sum+=1;
                   }
               }else{
                   int var=prefix[i-1];
                   int curr=prefix[j]-var;
                   if(curr==k){
                       sum+=1;
                   }
               }
                
            }
        }
        return sum;
        
    }
}