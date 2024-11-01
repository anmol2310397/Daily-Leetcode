class Solution {
    public String makeFancyString(String s) {
        StringBuilder sf=new StringBuilder(s);
        int count=1;
        for(int i=1;i<sf.length();i++){
            char ch=sf.charAt(i);
            char ch2=sf.charAt(i-1);
            if(ch==ch2){
                count++;
            }else
                count=1;
            if(count>=3){
                sf.deleteCharAt(i);
                i--;
            } }
        return sf.toString();
    }
}