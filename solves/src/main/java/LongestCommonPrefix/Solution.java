package LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) return "";
        String start = strs[0];
        for (String string : strs) {
            if (string == null || string == "") return "";
            while (!string.startsWith(start)) {
                int length = start.length() - 1;
                if (length < 1) return "";
                start = start.substring(0, length);
            }
        }
        return start;
    }
    public void nope(){
        return;
    }
}
