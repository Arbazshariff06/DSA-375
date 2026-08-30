class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
        int left = i;
        int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    return new int[] { left + 1, right + 1 };
                }
                right--;
            }
        }
        return new int[] {};
    }
}