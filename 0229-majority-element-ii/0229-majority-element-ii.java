class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        n/=3;
        ArrayList<Integer> li=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);

            if(map.get(i)>n && !li.contains(i)){
                li.add(i);
            }
            if(li.size()==2)
            break;
        }
        return li;
    }
}