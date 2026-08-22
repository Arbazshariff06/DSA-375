class Solution {
    public boolean checkDivisibility(int n) {
        int ans = n;
        int sum = 0;
        int mul = 1;
        while(ans>0){
            sum += (ans%10);
            mul *= (ans%10);
            ans /= 10;
        }
        int div = sum+mul;
        if(n % div == 0){
            return true;
        }
        else{
            return false;
        }
    }
}