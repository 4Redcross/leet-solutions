# Intuition
I solved the problem over 5 hours, I am sorry I don't remember my initial thought on how I was going to solve the problem 😭

# Approach
First we need to understand the condition. Problem states that our machine cannot store or process anything above 32-bit integers. So we know that our minimum possible value is `-2147483648` and maximum possible value is `2147483647`.

My approach was to convert the number to a positive number if negative and solve the problem from there.

The following were the steps for my approach - 
1. If the value is equal to lowest min value i.e. `-2147483648` we return 0. This step is necessary as converting this value to positive is not possible as max possible value is `2147483647`
2. Next store a `sign` variable if the given value is a negative value
3. Now the reversing the value - 
    - First we only reverse the number uptil second-last digit
    - This is needed as remember if our number is larger than MAX_VALUE then our operation will simply go to vain
    - Next we see if the reversed number till now is greater than `214748364` then we know it's NOT a possible 32-bit Integer
    - If number is equal to `214748364` we check if the last digit is greater than 7 for it to be a possible 32-bit Integer
4. If the number still remains a possible 32-bit Integer then we add the last digit and return the answer multiplied with the `sign`


# Complexity
- Time complexity: 0(N)
- Space complexity: O(N)

, where N is number of digits

# Code
```
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
```
