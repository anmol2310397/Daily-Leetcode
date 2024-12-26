class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer>li=new ArrayList<>();
        int k=0;
        for(String s:words){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==x){
                    li.add(k);
                    break;
                }
            }
            k++;
        }
        return li;
    }
}