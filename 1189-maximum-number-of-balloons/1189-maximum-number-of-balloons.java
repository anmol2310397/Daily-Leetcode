class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>(){{
            put('b', 1); put('a', 1);
            put('l', 2); put('o', 2);
            put('n', 1);
        }};
        for(char ch:text.toCharArray()){
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
          int count = text.length();

        for (char c : map2.keySet()) {
            count = Math.min(count, map.getOrDefault(c, 0) / map2.get(c));
        }

        return count;
    }
}