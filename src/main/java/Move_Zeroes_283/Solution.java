package Move_Zeroes_283;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,0,0};
        moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void moveZeroes(int[] nums) {
        int i = 0;
        int nextNonZeroPos = 0;
        while (i < nums.length - 1) {
            if (nums[i] == 0) {
                while (nextNonZeroPos < nums.length - 1 && nums[nextNonZeroPos] == 0) {
                    nextNonZeroPos++;
                }

                nums[i] = nums[nextNonZeroPos];
                nums[nextNonZeroPos] = 0;
            }

            i++;
            nextNonZeroPos = Math.max(nextNonZeroPos, i);
        }
    }
}
