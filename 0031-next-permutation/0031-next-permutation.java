class Solution {
    public void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int pivot = -1;

       
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }
        if (pivot == -1) {
            for (int i = 0; i < len / 2; i++) {
                swap(nums, i, len - i - 1);
            }
            return;
        }

        // Step 3: Find the smallest element in the suffix larger than nums[pivot]
        for (int i = len - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, pivot, i);
                break;
            }
        }
        int left = pivot + 1, right = len - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
