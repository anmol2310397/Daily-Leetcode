class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i=discounts.length-1;
        int j=prices.length-1;
        double sum=0.0;
        while(i>=0 && j>=0){
            sum+=(double)prices[j]*(100-discounts[i])/100;
            j--;
            i--;
        }
        while(j>=0){
            sum+=(double)prices[j];
            j--;
        }
        return sum;
    }
}