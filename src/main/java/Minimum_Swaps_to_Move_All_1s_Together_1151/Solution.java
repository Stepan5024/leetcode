package Minimum_Swaps_to_Move_All_1s_Together_1151;

public class Solution {

    public static void main(String[] args) {
        Solution solver = new Solution();

        int[] data = {1, 1, 1, 0, 1, 0, 1, 1};
        System.out.println("Minimum swaps: " + solver.minSwaps(data)); // Output: 1
    }


    public int minSwaps(int[] data) {
        int countOfOnes = 0;

        // Шаг 1: Подсчитываем общее количество единиц
        for (int num : data) {
            if (num == 1) {
                countOfOnes++;
            }
        }

        // Если в массиве меньше двух единиц, замен не требуется
        if (countOfOnes <= 1) {
            return 0;
        }

        // Шаг 2: Используем скользящее окно длиной countOfOnes
        int currentOnes = 0, maxOnesInWindow = 0;

        // Подсчитываем количество единиц в первом окне
        for (int i = 0; i < countOfOnes; i++) {
            if (data[i] == 1) {
                currentOnes++;
            }
        }
        maxOnesInWindow = currentOnes;

        // Шаг 3: Двигаем окно
        for (int i = countOfOnes; i < data.length; i++) {
            // Добавляем новый элемент в окно
            if (data[i] == 1) {
                currentOnes++;
            }
            // Убираем старый элемент из окна
            if (data[i - countOfOnes] == 1) {
                currentOnes--;
            }
            // Максимизируем количество единиц в окне
            maxOnesInWindow = Math.max(maxOnesInWindow, currentOnes);
        }

        // Шаг 4: Минимальное количество замен
        return countOfOnes - maxOnesInWindow;
    }
}
