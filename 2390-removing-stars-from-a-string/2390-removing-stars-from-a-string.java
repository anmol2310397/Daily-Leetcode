class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch!='*')
                st.push(ch);
            else{
                st.pop();
            }
        }
        String s1="";
            while(!st.isEmpty()){
                char ch1=st.pop();
                s1=ch1+s1;
            }
            return s1;
        
    }
}