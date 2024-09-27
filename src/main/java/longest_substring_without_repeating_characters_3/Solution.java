package longest_substring_without_repeating_characters_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> list = new HashSet<>();

        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            if (list.contains(s.charAt(right))) {
                while (left < s.length() && list.contains(s.charAt(right))) {
                    list.remove(s.charAt(left));
                    left++;
                }
            }
            list.add(s.charAt(right));
            max = Math.max(max, list.size());

        }

        return max;
    }
}