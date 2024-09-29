package Summary_Ranges_228;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        //int[] arr = {0, 1, 2, 4, 5, 7};
        int[] arr = {0,2,3,4,6,8,9};
        List<String> list = summaryRanges(arr);
        for (String s : list)
            System.out.println(s);
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int first = nums[0];
        int second = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1 + nums[i - 1]) {
                // диапазон

                second++;
            } else {
                if (first == second) {
                    list.add(first + "");
                } else
                    list.add(first + "->" + second);
                first = nums[i];
                second = nums[i];
            }

        }
        if (first == second) {
            list.add(first + "");
        } else
            list.add(first + "->" + second);
        return list;
    }
}
