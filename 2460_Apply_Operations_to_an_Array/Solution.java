class Solution {
    public static int[] applyOperations(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]){
                nums[i - 1] *= 2;
                nums[i] = 0;
            }
        }
        int zeroPointer = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[zeroPointer];
                nums[zeroPointer] = nums[i];
                nums[i] = temp;
                zeroPointer++;
            }
        }
        return nums;
    }
}
