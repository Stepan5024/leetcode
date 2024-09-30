package Line_Reflection_356;

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        List<int[]> points = new ArrayList<>();
        points.add(new int[]{1, 1});
        points.add(new int[]{-1, 1});

        System.out.println(lineReflection(points));
    }

    final static int X = 0;
    final static int Y = 1;
    public static List<int[]> getMinAndMaxByX(List<int[]> points) {
        int[] _max = points.get(0);
        int[] _min = points.get(0);
        for (int[] point : points) {
            if (point[X] > _max[X]) {
                _max = point;
            }
            if (point[X] < _min[X]) {
                _min = point;
            }
        }
        return Arrays.asList(_min, _max);
    }

    public static boolean lineReflection(List<int[]> points) {
        List<int[]> minMax = getMinAndMaxByX(points);
        int[] _min = minMax.get(0);
        int[] _max = minMax.get(1);

        int middleXDiff = (_max[X] - _min[X]) / 2;
        int middleX = _min[X] + middleXDiff;

        Set<String> pointsSet = new HashSet<>();
        for (int[] point : points) {
            int[] reflectionPoint = new int[]{point[X] + 2 * middleX - point[X], point[Y]};
            String reflectionKey = Arrays.toString(reflectionPoint);

            if (point[X] == middleX) {
                // Skip points on the middle line
                continue;
            } else if (pointsSet.contains(reflectionKey)) {
                pointsSet.remove(reflectionKey);
            } else {
                pointsSet.add(Arrays.toString(point));
            }
        }

        return pointsSet.isEmpty();
    }
}
