class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char i:s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
    int same=map.get(s.charAt(0));
    for(char ch:s.toCharArray()){
        if(map.get(ch)!=same)
        return false;
    }
    return true;
    }
}