package RotateArray;

class Solution {
    public void rotate(int[] nums, int k) {
        int steps = k % nums.length;
        int splitPos = nums.length - steps;
        int[] newArray = new int[nums.length];
        System.arraycopy(nums, splitPos, newArray, 0, nums.length - splitPos);
        System.arraycopy(nums, 0, newArray, steps, splitPos);
        System.arraycopy(newArray, 0, nums, 0, newArray.length);
    }
}
