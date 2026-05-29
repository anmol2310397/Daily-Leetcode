class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1 || numRows >= s.length())
            return s;

        String[] ans = new String[numRows];

        for(int i = 0; i < numRows; i++)
            ans[i] = "";

        int k = 0;
        boolean up = false;

        for(int i = 0; i < s.length(); i++) {

            ans[k] += s.charAt(i);

            if(k == numRows - 1)
                up = true;
            else if(k == 0)
                up = false;

            k += up ? -1 : 1;
        }

        String res = "";

        for(String st : ans)
            res += st;

        return res;
    }
}