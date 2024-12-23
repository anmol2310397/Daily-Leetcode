class Solution{
    public boolean areNumbersAscending(String s){
        int prevNum=0,currentNum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                currentNum=currentNum*10+(ch-'0');
            }
            else if(currentNum>0){
                if(currentNum<=prevNum){
                    return false;
                }
                prevNum=currentNum;currentNum=0;
            }
        }
        if(currentNum>0&&currentNum<=prevNum){
            return false;
        }
        return true;
    }
}
