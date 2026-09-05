class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int prod1 = nums[n - 2] * nums[n - 1] * nums[n];
        int prod2 = nums[0] * nums[1] * nums[n];
        int max = Math.max(prod1, prod2);
        return max;
    }
}