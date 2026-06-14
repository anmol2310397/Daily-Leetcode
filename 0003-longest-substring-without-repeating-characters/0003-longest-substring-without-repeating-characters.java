class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        HashMap<Character,Integer> map=new HashMap<>();
        int low=0,high=1;
        int max=1;
        map.put(s.charAt(low),0);
        while(low<=high && high<s.length()){
            char down=s.charAt(low);
            char up=s.charAt(high);
            if(!map.containsKey(up)){
                map.put(up,1);
                high++;
            }
            else{
                map.remove(down);
                low++;
            }
           max=Math.max(map.size(),max);
        }
        return max;
    }
}