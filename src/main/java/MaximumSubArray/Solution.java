package MaximumSubArray;

class Solution {
    public int maxSubArray(int[] nums) {
        int arraySize = nums.length;
        int maxSoFar = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < arraySize; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar,currentMax);
        }
        return maxSoFar;
    }
}
