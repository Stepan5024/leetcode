package Edit_Distance_72;

public class Solution {
    public static void main(String[] args) {
        String word1 = "horse";
        String word2 = "ros";

        System.out.println(minDistance(word1, word2));
    }

    public static int minDistance(String word1, String word2) {
        final int m = word1.length();
        final int n = word2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; ++i) {
            dp[i][0] = i;
        }

        for (int j = 1; j <= n; ++j) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // Совпадение символов, действия не требуется
                } else {
                    int replace = dp[i - 1][j - 1] + 1; // Замена символа
                    int delete = dp[i - 1][j] + 1;      // Удаление символа из word1
                    int insert = dp[i][j - 1] + 1;      // Вставка символа в word1

                    // Выбираем минимальное действие
                    dp[i][j] = Math.min(replace, Math.min(delete, insert));
                }
            }
        }

        return dp[m][n];
    }
}
