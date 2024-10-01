package Is_Subsequence_392;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isSubsequence("", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        boolean isSubsequence = false;
        if (s.length() > t.length()) return false;
        int pointInS = 0;
        for (int i = 0; i < t.length(); i++) {
            if (pointInS < s.length() && s.charAt(pointInS) == t.charAt(i)) {
                pointInS++;
            }
        }
        if (pointInS == s.length()) isSubsequence = true;
        return isSubsequence;    
    }
}
