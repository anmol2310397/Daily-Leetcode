class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        char ch1=')';
        for(char ch:s.toCharArray()){
            if(map.get(ch)==1)
            {
                ch1=ch;
                break;
            }
        }
        return ch1==')'?-1:s.indexOf(ch1);
    }
}