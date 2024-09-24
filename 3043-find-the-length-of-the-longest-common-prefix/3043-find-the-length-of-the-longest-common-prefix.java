class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> h1=new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            int value=arr1[i];
            while(value>0)
            {
                h1.add(value);
                value/=10;
            }    
        }
        int max=0;
        for(int i=0;i<arr2.length;i++)
        {
            int value2=arr2[i];
            while(value2>0)
            {
                if(h1.contains(value2))
                {
                    if(String.valueOf(value2).length()>max)
                        max=String.valueOf(value2).length();
                }
                value2/=10;
            }
        }
        return max;
        
    }
}