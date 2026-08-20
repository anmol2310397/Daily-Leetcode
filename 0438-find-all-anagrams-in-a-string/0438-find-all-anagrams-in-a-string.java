import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> mapP = new HashMap<>();
        HashMap<Character, Integer> mapS = new HashMap<>();

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length()) {
            return ans;
        }

        for (char ch : p.toCharArray()) {
            mapP.put(ch, mapP.getOrDefault(ch, 0) + 1);
        }

        int size = p.length();

        for (int i = 0; i < size; i++) {
            char ch = s.charAt(i);
            mapS.put(ch, mapS.getOrDefault(ch, 0) + 1);
        }

        if (mapP.equals(mapS)) {
            ans.add(0);
        }

        for (int i = size; i < s.length(); i++) {

            char add = s.charAt(i);
            mapS.put(add, mapS.getOrDefault(add, 0) + 1);

            char remove = s.charAt(i - size);

            mapS.put(remove, mapS.get(remove) - 1);

            if (mapS.get(remove) == 0) {
                mapS.remove(remove);
            }

            if (mapP.equals(mapS)) {
                ans.add(i - size + 1);
            }
        }

        return ans;
    }
}