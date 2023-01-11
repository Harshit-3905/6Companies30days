class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int e = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max)
                max = nums[i];
            else
                e = i;
        }
        int min = Integer.MAX_VALUE;
        int s = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] <= min)
                min = nums[i];
            else
                s = i;
        }
        if (s == -1 && e == -1)
            return 0;
        return e - s + 1;
    }
}