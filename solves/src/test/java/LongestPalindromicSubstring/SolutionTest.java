package LongestPalindromicSubstring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @CsvSource(value = {
            "bb, cbbd",
            "aaaa, aaaa",
            "aaaaaa, aaaaaa",
            "aaaaaaa, aaaaaaa",
            "bb, abb",
            "ff, jhfgjkhgff",
            "bab, babad",
            "dopod, sadfasddopod",
            "dopod, asfdasddopodcvxxxcv",
            "a, asd",
            "a, ac",
            "dopod, dopod"
    })
    void longestCommonPrefix(String result, String strData) {
        Solution solution = new Solution();
        assertEquals(result, solution.longestPalindrome(strData), "Error in " + strData + " -> " + result);
    }

}