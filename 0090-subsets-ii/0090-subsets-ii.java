class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();

        Arrays.sort(nums);

        solve(0, nums, new ArrayList<>(), set);

        return new ArrayList<>(set);
    }

    void solve(int idx,
               int[] nums,
               List<Integer> curr,
               Set<List<Integer>> set) {

        if(idx == nums.length){
            set.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[idx]);
        solve(idx + 1, nums, curr, set);

        curr.remove(curr.size() - 1);
        solve(idx + 1, nums, curr, set);
    }
}