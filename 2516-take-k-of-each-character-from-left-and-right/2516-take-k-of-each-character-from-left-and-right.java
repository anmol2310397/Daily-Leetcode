class Solution {
    public int takeCharacters(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('b', 0);
        map.put('c', 0);
        
        for (char c : s.toCharArray()) {
            map.put(c, map.get(c) + 1);
        }
        
        for (int count : map.values()) {
            if (count < k) {
                return -1;
            }
        }
        
        int n = s.length();
        int targetA = map.get('a') - k;
        int targetB = map.get('b') - k;
        int targetC = map.get('c') - k;

        int left = 0, maxValid = 0;
        int currA = 0, currB = 0, currC = 0;

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            if (ch == 'a') currA++;
            if (ch == 'b') currB++;
            if (ch == 'c') currC++;
            
            while (currA > targetA || currB > targetB || currC > targetC) {
                char leftChar = s.charAt(left);
                if (leftChar == 'a') currA--;
                if (leftChar == 'b') currB--;
                if (leftChar == 'c') currC--;
                left++;
            }
            
            maxValid = Math.max(maxValid, right - left + 1);
        }

        return n - maxValid;
    }
}
