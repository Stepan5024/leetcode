package Intersection_of_Two_Arrays_349;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // Добавляем все элементы из nums1 в set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Проверяем каждый элемент из nums2
        // Если он есть в set1, добавляем в resultSet
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        // Преобразуем resultSet в массив int[]
        int[] result = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            result[i++] = num;
        }

        return result;
    }

}
