class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> h=new HashMap<>();
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(h.containsKey(arr[i])){
                h.put(arr[i],h.get(arr[i])+1);
            }else
                h.put(arr[i],1);
        }
        for(int i:h.values()){
            if(li.contains(i))
                return false;
            else
                li.add(i);
        }
        return true;
        
    }
}