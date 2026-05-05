class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(isTrue(words[i],words[j]))count++;
            }
        }
        return count;
    }
    boolean isTrue(String a,String b){
        if(b.startsWith(a) && b.endsWith(a))
        return true;
        return false;
    }
}