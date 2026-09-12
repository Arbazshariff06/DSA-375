class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list01 = new ArrayList<>();
        int n = nums.length-1;
        for (int i = 0; i < n; i++) {
            list01.add(nums[i]);
        }

        int low = nums[0];
        int high = nums[n];
        ArrayList<Integer> list02 = new ArrayList<>();
        for(int i=low;i<high;i++){
            if(!list01.contains(i)){
                list02.add(i);
            }
        }
        return list02;
    }
}