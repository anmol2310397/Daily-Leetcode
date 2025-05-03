class Solution {
    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {

        HashSet<Integer> hs1 = new HashSet<Integer>();
        HashSet<Integer> hs2 = new HashSet<Integer>();

        for (int i = 0; i < nums1.length; i++) {

            hs1.add(nums1[i]);

        }

        for (int i = 0; i < nums2.length; i++) {

            hs2.add(nums2[i]);

        }

        int ans1 = 0;
        int ans2 = 0;

        for (int num : nums1) {
            if (hs2.contains(num)) {
                ans1++;
            }
        }

        for (int num : nums2) {
            if (hs1.contains(num)) {
                ans2++;
            }
        }

        return new int[] { ans1, ans2 };

    }
}