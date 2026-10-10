
class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int maxLeft = Integer.MIN_VALUE;

        for (int j = k; j < nums.length; j++) {
            maxLeft = Math.max(maxLeft, nums[j - k]);
            maxSum = Math.max(maxSum, maxLeft + nums[j]);
        }

        return maxSum;
    }
}
