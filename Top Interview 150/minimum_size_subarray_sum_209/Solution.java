package minimum_size_subarray_sum_209;

class Solution {
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int subArrayStartIndex = 0;
        int currentSubArrayLength = 0;
        int minSubArrayLength = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            currentSubArrayLength++;

            while (sum >= target) {
                if (minSubArrayLength == 0 || currentSubArrayLength < minSubArrayLength) {
                    minSubArrayLength = currentSubArrayLength;
                }
                sum -= nums[subArrayStartIndex];
                subArrayStartIndex++;
                currentSubArrayLength--;
            }
        }

        return minSubArrayLength;
    }
}
