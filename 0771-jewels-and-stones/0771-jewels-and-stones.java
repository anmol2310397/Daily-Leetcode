class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:stones.toCharArray()){
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        int count=0;
        for(char ch:jewels.toCharArray()){
            count+=map.getOrDefault(ch,0);
        }
        return count;
    }
}