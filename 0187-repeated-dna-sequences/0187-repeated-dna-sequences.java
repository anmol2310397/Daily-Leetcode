class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int start=0,end=10;
        HashMap<String,Integer>map=new HashMap<>();
        while(end<=s.length()){
            String s1=s.substring(start,end);
            map.put(s1,map.getOrDefault(s1,0)+1);
            start++;
            end++;
        }
        ArrayList<String>li=new ArrayList<>();
        for(Map.Entry<String,Integer>entry:map.entrySet()){
            String s2=entry.getKey();
            int n=entry.getValue();
            if(n>1)
            li.add(s2);
        }
        return li;
    }
}