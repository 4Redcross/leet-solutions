class Solution {
    public static int reverse(int x) {
        if(x == Integer.MIN_VALUE) {
            return 0;
        }

        int sign = 1;
        if(x < 0) {
            sign = -1;
            x = -x;
        }

        int ans = 0;
        while(x >= 10) {
            ans *= 10;
            ans += (x % 10);
            x = x / 10;
        }

        if(ans > 214748364) return 0;
        if(ans == 214748364 && x > 7) return 0;
        
        ans = (ans * 10) + x;
        return ans * sign;
    }
}
