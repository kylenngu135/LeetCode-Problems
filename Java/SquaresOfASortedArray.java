class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length]; 
        int i = 0;
        int j = nums.length - 1;
        int k = ans.length - 1;

        while (i <= j) {
            int sq1 = nums[i] * nums[i];
            int sq2 = nums[j] * nums[j];
            if (sq1 < sq2) {
                ans[k] = sq2;
                j--;
            } else {
                ans[k] = sq1;
                i++;
            }

            k--;
        }

        return ans;
    }
}
