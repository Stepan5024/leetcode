package Valid_Anagram_242;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        int[] cons = new int[58];
        if (s.length() != t.length()) return false;
        for (char c : s.toCharArray()) {
            cons[c - 'A']++;
        }

        for (char c : t.toCharArray()) {
            cons[c - 'A']--;
            if (cons[c - 'A'] < 0) {
                return false;
            }
        }
        return true;
    }
}
