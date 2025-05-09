class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        ArrayList<Integer>li=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
            li.add(i);
        }
        if(li.size()<=1)
        return 0;
        int max=0;
        for(int i=1;i<li.size();i++){
            max=Math.max(max,li.get(i)-li.get(i-1));
        }
        return max;
    }
}