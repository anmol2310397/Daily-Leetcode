class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:digits){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=100;i<=999;i+=2){
            HashMap<Integer,Integer>mapDigit=new HashMap<>();
            int num1,num2,num3;
            num1=i/100;
            num2=(i/10)%10;
            num3=(i%10);
            mapDigit.put(num1,mapDigit.getOrDefault(num1,0)+1);
            mapDigit.put(num2,mapDigit.getOrDefault(num2,0)+1);
            mapDigit.put(num3,mapDigit.getOrDefault(num3,0)+1);
            if(map.getOrDefault(num1,0)>=mapDigit.get(num1)&&map.getOrDefault(num2,0)>=mapDigit.get(num2)&&map.getOrDefault(num3,0)>=mapDigit.get(num3))
            li.add(i);      
        }
        int ans[]=new int[li.size()];
        for(int i=0;i<li.size();i++)
        ans[i]=li.get(i);
         Arrays.sort(ans);
         return ans;
    }
}