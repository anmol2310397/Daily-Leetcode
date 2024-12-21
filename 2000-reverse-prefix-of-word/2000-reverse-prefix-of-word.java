class Solution { 
    static String swap(String str, int i, int j)
    {
        if (j == str.length() - 1)
            return str.substring(0, i) + str.charAt(j)
                + str.substring(i + 1, j) + str.charAt(i);

        return str.substring(0, i) + str.charAt(j)
            + str.substring(i + 1, j) + str.charAt(i)
            + str.substring(j + 1, str.length());
    }
    public String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);
        if(index==-1)
        return word;
        int i=0;
        while(i<index){
            word=swap(word,i,index--);
            i++;
        }
    return word;
    }
}