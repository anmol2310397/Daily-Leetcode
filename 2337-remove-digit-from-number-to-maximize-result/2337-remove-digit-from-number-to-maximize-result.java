class Solution {
    public String removeDigit(String number, char digit) {
        String a="";
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)==digit){
                String s=number.substring(0,i)+number.substring(i+1,number.length());
                if(s.compareTo(a)>0)
                a=s;
            }
        }
        return a;
    }
}