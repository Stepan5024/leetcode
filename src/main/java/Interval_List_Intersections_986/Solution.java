package Interval_List_Intersections_986;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();

        int firstIndex = 0;
        int secondIndex = 0;
        int startMax = 0, endMin = 0;

        while (firstIndex < firstList.length && secondIndex < secondList.length) {
            startMax = Math.max(firstList[firstIndex][0], secondList[secondIndex][0]);
            endMin = Math.min(firstList[firstIndex][1], secondList[secondIndex][1]);
            if (endMin >= startMax) {
                list.add(new int[]{startMax, endMin});
            }
            if (endMin == firstList[firstIndex][1]) firstIndex++;
            if (endMin == secondList[secondIndex][1]) secondIndex++;
        }
        return list.toArray(new int[list.size()][2]);
    }

}
