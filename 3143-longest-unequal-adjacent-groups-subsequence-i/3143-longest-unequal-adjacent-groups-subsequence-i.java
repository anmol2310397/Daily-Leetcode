class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
       ArrayList<String>li=new ArrayList<>();
       int n=words.length;
       li.add(words[0]);
       for(int i=1;i<n;i++){
        if(groups[i]!=groups[i-1])
        li.add(words[i]);
       } 
       return li;
    }
}