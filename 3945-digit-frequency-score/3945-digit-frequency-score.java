class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int num=n;
        while(num>0){
            int rem=num%10;
            map.put(rem,map.getOrDefault(rem,0)+1);
            num/=10;
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            sum+=entry.getKey()*entry.getValue();
        }
        return sum;
    }
}