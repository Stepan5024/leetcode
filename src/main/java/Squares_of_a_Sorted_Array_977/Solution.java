package Squares_of_a_Sorted_Array_977;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3})));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int begin = 0;
        int size = nums.length - 1;
        int end = nums.length - 1;
        while (begin <= end) {
            if (Math.abs(nums[begin]) > Math.abs(nums[end])) {
                res[size] = nums[begin] * nums[begin];
                begin++;
            } else {
                res[size] = nums[end] * nums[end];
                end--;
            }
            size--;
        }
        return res;
    }
}
