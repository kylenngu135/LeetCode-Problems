class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> intSet = new HashSet<>();
        for (int i = 0 ; i < nums.length; i++) {
            if (intSet.contains(nums[i])) {
                return true;
            }
            intSet.add(nums[i]);
        }
        return false;
    }
}
