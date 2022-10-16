package LongestCommonPrefix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @CsvSource(value = {
            "fl, flower;flow;flight",
            ", dog;racecar;car",
            "dop, doplai;dopvcxb;dop;doprwesgfd",
            "fg, fg",
            "a, ab;a"
    })
    void longestCommonPrefix(String result, String strData) {
        String[] data = strData.split(";");
        if (result == null) result = "";
        Solution solution = new Solution();
        assertEquals(result, solution.longestCommonPrefix(data), "Error in " + strData + " -> " + result);
    }

}