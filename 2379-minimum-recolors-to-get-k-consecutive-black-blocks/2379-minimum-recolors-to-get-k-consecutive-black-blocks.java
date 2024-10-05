class Solution {
    public int minimumRecolors(String blocks, int k) {
        String s=blocks.substring(0,k);
        // System.out.println(s);
        int frq=freq(s);
        int n=frq,j=1,l=k+1;
        while (l<=blocks.length())
        {
            s=blocks.substring(j++,l++);
            // System.out.println(s+" "+n);
            n=Math.min(n,freq(s));
        }
        return (n);
    }
    public int freq(String str){
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='W')
                count++;
        }
        
       
        return count;
    }
}