class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if (map.containsKey(i - k)) {
                count += map.get(i - k);
            }
            if (map.containsKey(i + k)) {
                count += map.get(i + k);
            }
                map.put(i,map.getOrDefault(i,0)+1);
        }
        return count;
    }
}