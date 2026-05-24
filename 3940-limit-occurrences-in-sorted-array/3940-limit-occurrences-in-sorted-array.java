class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }    
        ArrayList<Integer>li=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();
            int min=Math.min(val,k);
            for(int i=0;i<min;i++){
                li.add(key);
            }
        }
        int ans[]=new int[li.size()];
        int c=0;
        for(int i:li){
            ans[c]=i;
            c++;
        }
        Arrays.sort(ans);
        return ans;
        }
}