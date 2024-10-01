package Find_All_Anagrams_in_a_String_438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        System.out.println(findAnagrams("abab", "ab"));
    }


    public static List<Integer> findAnagrams(String s, String p) {
        if(s.length() < p.length())
            return List.of();

        final List<Integer> result = new ArrayList<>();
        final int n = p.length();
        final int[] freq1 = new int[26], freq2 = new int[26];

        for(int i = 0; i < n; ++i) {
            freq1[p.charAt(i) - 'a']++;
            freq2[s.charAt(i) - 'a']++;
        }

        if(Arrays.equals(freq1, freq2))
            result.add(0);

        for(int i = n; i < s.length(); ++i) {
            freq2[s.charAt(i - n) - 'a']--;
            freq2[s.charAt(i) - 'a']++;

            if(Arrays.equals(freq1, freq2))
                result.add(i - n + 1);
        }

        return result;
    }
}