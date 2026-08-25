class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
     int num=k;
        while(k>0){
            if(!set.contains(num))
            return num;
            num+=k;
          }
        return -1;
    }
}