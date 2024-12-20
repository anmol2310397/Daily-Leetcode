class Solution {
    private void reverse(int[] array) {
        int start = 0, end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        reverse(capacity);
        int sum=0;
        for(int i:apple)
            sum+=i;
        int count=0,sum1=0;
        for(int i:capacity){
            sum1+=i;
            count++;
            if(sum1>=sum)
                return count;
        }
        return -1;
    }
}