class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        int sum=0;
        for(int i=1;i<=s.length();i++)
        {
            char ch1=s.charAt(s.length()-i);
            if(i>1 && h.get(ch1)<h.get(s.charAt(s.length()-i+1)))
            {
                char ch2=s.charAt(s.length()-i+1);
                sum=sum-h.get(ch1);
            }
            else
            {
                sum=sum+h.get(ch1);
            }
        }
        return sum;
    }
}