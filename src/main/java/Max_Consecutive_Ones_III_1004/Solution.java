package Max_Consecutive_Ones_III_1004;

class Solution {
    public static int longestOnes(int[] nums, int k) {
        int max = 0;
        int zeroCounts = 0;
        int startOfSlidingWindow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
             zeroCounts++;
            }

            while (zeroCounts > k) {
                if (nums[startOfSlidingWindow] == 0) {
                    zeroCounts--;
                }
                startOfSlidingWindow++;
            }

            max = Math.max(max, i - startOfSlidingWindow + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
    }
}