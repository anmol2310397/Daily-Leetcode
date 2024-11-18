class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
    
        for(char ch1:magazine.toCharArray()){
            if(map.containsKey(ch1))
                map.put(ch1,map.get(ch1)+1);
            else
                map.put(ch1,1);
        }
        for(char ch1:ransomNote.toCharArray()){
            if(map.containsKey(ch1) && map.get(ch1)>0)
                map.put(ch1,map.get(ch1)-1);
            else
                return false;
        }
        return true;
    }
}