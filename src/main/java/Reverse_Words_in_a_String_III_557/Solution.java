package Reverse_Words_in_a_String_III_557;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String string : arr) {

            sb.append(reverseWord(string));
            sb.append(" ");
        }

        return sb.toString();
    }

    public static String reverseWord(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        return sb.toString();

    }
}
