import java.util.*;
class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char ch='a';ch<='z';ch++){
            map1.put(ch,0);
            map2.put(ch,0);
        }
        for(char ch:s.toCharArray()){
            
                map1.put(ch,map1.get(ch)+1);
            
        }
         for(char ch:t.toCharArray()){
            
                map2.put(ch,map2.get(ch)+1);
         }
        int sum=0;
        for(char ch='a';ch<='z';ch++){
            sum+=Math.abs(map1.get(ch)-map2.get(ch));
        }
        return sum;
    }
}