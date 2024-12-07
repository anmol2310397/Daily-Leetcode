import java.util.Stack;
class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch != '*') st.push(ch);
            else st.pop();
        }
        StringBuilder s1 = new StringBuilder();
        while (!st.isEmpty()) s1.append(st.pop());
        return s1.reverse().toString();
    }
}
