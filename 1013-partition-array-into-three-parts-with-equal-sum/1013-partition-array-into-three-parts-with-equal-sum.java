class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i : arr) 
            sum += i;

        if (sum % 3 != 0)
            return false;

        int target = sum / 3; 
        int count = 0;        
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum == target) {
                count++;
                currentSum = 0;
            }

            if (count == 3) 
                return true;
        }
        return false;
    }
}
