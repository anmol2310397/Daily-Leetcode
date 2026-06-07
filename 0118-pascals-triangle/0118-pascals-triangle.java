class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answ=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> temp=new ArrayList<>();
            long ans=1;
            temp.add((int)ans);
            for(int j=1;j<i;j++){
                ans=ans*(i-j);
                ans=ans/j;
                temp.add((int)ans);
            }
            answ.add(temp);
        }
        return answ;
    }
}