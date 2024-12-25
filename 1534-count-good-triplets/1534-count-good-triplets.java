class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int len=arr.length,count=0;
        for(int i=0;i<len-2;i++){
            for(int j=i+1;j<len-1;j++){
                for(int k=j+1;k<len;k++){
                    int n1=Math.abs(arr[i]-arr[j]);
                    int n2=Math.abs(arr[j]-arr[k]);
                    int n3=Math.abs(arr[i]-arr[k]);
                    if(n1<=a&& n2<=b&&n3<=c)
                        count++;
                }
            }
        }
        return count;
    }
}