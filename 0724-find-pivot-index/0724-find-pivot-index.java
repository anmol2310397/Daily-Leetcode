class Solution {
    public int pivotIndex(int[] nums) {
        int len=nums.length;
        for(int i=1;i<len;i++)
        {
            nums[i]=nums[i]+nums[i-1];
        }
        int leftsum=0,rightsum=0;
        for(int i=0;i<len;i++)
        {
            if(i==0)
            {
                rightsum=nums[len-1]-nums[0];
                leftsum=0;
                if(rightsum==leftsum)
                    return 0;
            }
            if(i==len-1)
            {
                rightsum=0;
                leftsum=nums[len-2];
                if(leftsum==rightsum)
                    return (len-1);
            }if(i>0&&i<len-1)
            {
            rightsum=nums[len-1]-nums[i];
            leftsum=nums[i-1];
            if(leftsum==rightsum)
                return i;
        }
        }
        return -1;
    }
}