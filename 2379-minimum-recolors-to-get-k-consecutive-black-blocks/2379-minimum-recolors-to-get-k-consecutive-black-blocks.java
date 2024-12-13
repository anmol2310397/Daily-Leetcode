class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W')
                count++;
        }
        int j=0,min=count;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
            if(blocks.charAt(j)=='W')
                count--;
            j++;
            min=Math.min(min,count);
        }
        return min;
    }
}