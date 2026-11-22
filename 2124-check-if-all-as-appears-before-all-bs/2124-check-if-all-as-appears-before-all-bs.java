class Solution {
    public boolean checkString(String s) {
        HashSet<Character> set=new HashSet<>();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='b' && set.contains('a')){
                return false;
            }
            set.add(s.charAt(i));
        }
        return true;
    }
}