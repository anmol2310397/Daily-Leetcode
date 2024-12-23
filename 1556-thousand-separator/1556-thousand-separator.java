class Solution {
    public String thousandSeparator(int n) {
        String s=String.valueOf(n);
        if(s.length()<=3)
            return s;
        String s1="";
        int k=0;
        for(int i=s.length()-1;i>=0;i--){
            k++;
             s1=s.charAt(i)+s1;
            if(k%3==0 && i!=0){
                s1="."+s1;
            }
           
        }
        return s1;
    }
}