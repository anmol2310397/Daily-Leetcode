import java.util.StringTokenizer;

class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder reversed = new StringBuilder();

        // Loop through the tokens in reverse order
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            reversed.insert(0, word + " "); // Insert at the beginning
        }

        // Remove the trailing space and return the result
        return reversed.toString().trim();
    }
}
