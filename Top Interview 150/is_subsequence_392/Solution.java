package is_subsequence_392;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        int lastFoundIndex = 0;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(lastFoundIndex)) {
                lastFoundIndex++;
            }

            if (lastFoundIndex == s.length()) {
                return true;
            }
        }

        return false;
    }
}
