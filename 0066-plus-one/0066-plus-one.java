class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        if(digits[len-1]!=9){
            digits[len-1]+=1;
            return digits;
        }
        int ans[]=new int[len+1];
        int cnt=0;
        for(int i:digits){
            if(i==9)
                cnt++;
        }
        if(cnt==len){
            ans[0]=1;
            for(int i=1;i<ans.length;i++){
                ans[i]=0;
            }
            return ans;
        }
        else{
            for(int i=len-1;i>=0;i--){
                if(digits[i]==9)
                    digits[i]=0;
                else
                {
                    digits[i]+=1;
                    break;
                }
            }
            return digits;
        }
        
    }
}