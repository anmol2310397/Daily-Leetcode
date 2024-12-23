class Solution {
    public int countValidWords(String sentence) {
        String[] word = sentence.trim().split("\\s+");
        int count = 0;
        for (String s : word) {
            if (s.isEmpty()) continue;
            int len = s.length(), countp = 0, counth = 0;
            if (s.charAt(len - 1) == '-' || s.charAt(0) == '-') continue;
            boolean isValid = true;
            for (int i = 0; i < len; i++) {
                char ch = s.charAt(i);
                if (Character.isDigit(ch)) {
                    isValid = false;
                    break;
                }
                if (ch == '!' || ch == ',' || ch == '.') {
                    countp++;
                    if (countp > 1 || i != len - 1) {
                        isValid = false;
                        break;
                    }
                }
                if (ch == '-') {
                    counth++;
                    if (counth > 1 || i == 0 || i == len - 1 || !Character.isLetter(s.charAt(i - 1)) || !Character.isLetter(s.charAt(i + 1))) {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid) count++;
        }
        return count;
    }
}
