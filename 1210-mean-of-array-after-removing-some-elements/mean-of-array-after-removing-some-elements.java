class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int k = arr.length / 20;
        double sum = 0;
        for (int i = k; i < n - k; i++) {
            sum += arr[i];
        }
        int res = (n - n / 10);
        return sum / res;
    }
}