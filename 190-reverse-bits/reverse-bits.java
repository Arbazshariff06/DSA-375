class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int last = n & 1;
            int reverselsb = last << (31 - i);
            result = result | reverselsb;
            n = n >> 1;
        }
        return result;
    }
}