class Solution {
    public int convertTime(String current, String correct) {
        int hourcu=Integer.parseInt(current.substring(0,2));
        int mincu=Integer.parseInt(current.substring(3));
        int hourco=Integer.parseInt(correct.substring(0,2));
        int minco=Integer.parseInt(correct.substring(3));
        int cu=(hourcu*60)+mincu;
        int co=(hourco*60)+minco;
        int diff=co-cu;
        int count=0;
        while(diff>0){
            if(diff>=60)
                diff-=60;
            else if(diff>=15)
                diff-=15;
            else if(diff>=5)
                diff-=5;
            else
                diff--;
            
        count++;
        }
        return count;
    }
}