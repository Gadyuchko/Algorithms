import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Subsequence {

    static Map<String, Boolean> areSubsequence(String[] strings, String t) {
        Map<String, Boolean> result = new LinkedHashMap<>();
        Arrays.stream(strings).forEach(el -> {
            result.put(el, isSubsequence(el, t));
        });
        return result;
    }

    static boolean isSubsequence(String s, String t) {
        int i = 0;
        int y = 0;
        while (i < s.length() && y < t.length()) {
            if (s.charAt(i) == t.charAt(y)) {
                i++;
            } y++;
        }
        return i==s.length();
    }
}
