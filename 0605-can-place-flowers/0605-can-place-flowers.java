class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; // Count how many flowers we can plant
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            // Check if the current spot is empty
            // and the left and right spots are empty (or out of bounds)
            if (flowerbed[i] == 0 && 
                (i == 0 || flowerbed[i - 1] == 0) && // Check left
                (i == len - 1 || flowerbed[i + 1] == 0)) { // Check right
                flowerbed[i] = 1; // Plant a flower here
                count++; // Increase our count of planted flowers
            }
        }
        
        // Check if we planted at least 'n' flowers
        return count >= n; 
    }
}
