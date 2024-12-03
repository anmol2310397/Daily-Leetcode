class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder s1 = new StringBuilder();
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            if (a < spaces.length && i == spaces[a]) {
                s1.append(" ");
                a++;
            }
            s1.append(s.charAt(i));
        }
        return s1.toString();
    }
}
