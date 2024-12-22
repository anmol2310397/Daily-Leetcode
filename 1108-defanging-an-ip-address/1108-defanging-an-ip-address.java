class Solution {
    public String defangIPaddr(String address) {
        String s="";
        char ch[]=address.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='.'){
                s+="[.]";
            }
            else
                s+=ch[i];
        }
        return s;
    }
}