class Solution {
    public int[] scoreValidator(String[] events) {
        int counter=0,score=0;
        for(String s:events){
            if(counter==10)
            break;
            if(s.equals("0")||s.equals("1")||s.equals("2")||s.equals("4")||s.equals("5")||s.equals("6")||s.equals("3"))
            score+=Integer.parseInt(s);
           else if(s.equals("W"))
            counter++;
            else 
            score+=1;
        }
        int ans[]=new int[2];
        ans[0]=score;
        ans[1]=counter;
        return ans;
    }
}