class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int count=nums.length;
        int fact=1;
        for(int i=1;i<=count;i++)
        fact=fact*i;
        Arrays.sort(nums);
        // ArrayList<Integer>temp=new ArrayList<>();
        // for(int i:nums)temp.add(i);
        // ans.add(temp);
        for(int i=1;i<=fact;i++){
            nextPermutation(nums);
            ArrayList<Integer> li=new ArrayList<>();
            for(int j:nums){
                li.add(j);
            }
            ans.add(li);
        }
        return ans;
    }
    public void nextPermutation(int[] nums) {
        int idx=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            int low=0,high=n-1;
            while(low<=high){
                swap(nums,low,high);
                low++; high--;
            }
            return;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>nums[idx]){
                swap(nums,i,idx);
                break;
            }
        }
        int low=idx+1,high=n-1;
        while(low<=high){
            swap(nums,low,high);
            low++; high--;
        }
    }
    public void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}