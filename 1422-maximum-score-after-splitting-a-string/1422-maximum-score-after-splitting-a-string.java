import java.util.HashMap;

class Solution {
    public int maxScore(String s) {
        int len = s.length();
        int maxScore = 0;

        // Loop through the string and split it
        for (int i = 0; i < len - 1; i++) {
            // Count zeros in the left part (s[0:i+1])
            int countZero = zero(s.substring(0, i + 1));
            // Count ones in the right part (s[i+1:len])
            int countOne = one(s.substring(i + 1, len));
            
            // Calculate the score for this split
            maxScore = Math.max(maxScore, countZero + countOne);
        }

        return maxScore;
    }

    // Count zeros in the given string
    public int zero(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '0') {
                count++;
            }
        }
        return count;
    }

    // Count ones in the given string
    public int one(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '1') {
                count++;
            }
        }
        return count;
    }
}
