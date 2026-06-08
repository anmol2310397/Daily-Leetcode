class Solution {
    public void sortColors(int[] nums) {
        int count1=0,count2=0,count0=0;
        for(int i:nums){
            if(i==1)count1++;
            else if(i==2)count2++;
            else count0++;
        }
            int k=0;
            while(count1>0||count2>0||count0>0){
                if(count0>0){
                    nums[k]=0;
                    count0--;
                }
                else if(count1>0){
                    nums[k]=1;
                    count1--;
                }
                else{
                    nums[k]=2;
                    count2--;
                }
                k++;
            }
            return;
        }
}