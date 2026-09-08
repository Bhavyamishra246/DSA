class Solution {
    public int countSpecialIntegers(int[] nums) {
        boolean[] seen = new boolean[101];
        boolean[] special = new boolean[101];
        for (int i = 0; i < 101; i++) {
            special[i] = true;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                if (seen[nums[i]]) {
                    special[nums[i]] = false;
                }

                seen[nums[i]] = true;
            }
        }
        int count = 0;
        for (int i = 0; i < 101; i++) {
            if (seen[i] && special[i]) {
                count++;
            }
        }

        return count;
    }
}