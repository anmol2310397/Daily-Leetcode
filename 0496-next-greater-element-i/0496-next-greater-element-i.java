class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int k = 0;
        for (int i : nums1) {
            int index = -1;
            for (int q = 0; q < nums2.length; q++) {
                if (nums2[q] == i) {
                    index = q;
                    break;
                }
            }

    
            boolean found = false;
            for (int j = index + 1; j < nums2.length; j++) {
                if (nums2[j] > nums2[index]) {
                    ans[k] = nums2[j];
                    found = true;
                    break;
                }
            }

            if (!found) {
                ans[k] = -1;
            }
            k++;
        }
        return ans;
    }
}
