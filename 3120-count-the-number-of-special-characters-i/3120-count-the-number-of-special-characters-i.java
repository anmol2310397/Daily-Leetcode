class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Character> map=new HashMap<>();
        HashSet<Character>set=new HashSet<>();
        char a='a',b='A';
        for(int i=0;i<26;i++){
            map.put(a,b);
            a++;
            b++;
        }
        for(char ch:word.toCharArray()){
            set.add(ch);
        }
        HashSet<Character>rep=new HashSet<>();
        int count=0;
        for(char ch:word.toCharArray()){
            if(Character.isLowerCase(ch)){
                if(!rep.contains(ch)){
                    if(set.contains(map.get(ch)))
                    count++;
                }
                rep.add(ch);
            }
            
        }
        return count;
    }
}