package LongestPalindromicSubstring;

public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        if (s.length() == 1) return s;
        String res = String.valueOf(s.charAt(0));
        int startIndex = 0;

        while (startIndex < s.length()) {
            res = searcher(startIndex, startIndex + 2, s, res);
            res = searcher(startIndex, startIndex + 1, s, res);
            startIndex++;
        }
        return res;
    }

    private String searcher(int min, int max, String s, String res) {
        while (min >= 0 && max < s.length()) {
            if (s.charAt(min) == s.charAt(max)) {
                if (max + 1 - min > res.length()) res = s.substring(min, max + 1);
            } else break;
            min--;
            max++;
        }
        return res;
    }
}
