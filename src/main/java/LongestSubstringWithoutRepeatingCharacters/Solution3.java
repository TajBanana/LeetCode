package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, maxSubString = 0;
        int stringLength = s.length();

        Set<Character> characterSet = new HashSet<>();

        while (j < stringLength) {
            if (!characterSet.contains(s.charAt(j))) {
                characterSet.add(s.charAt(j));
                j++;
                maxSubString = Math.max(maxSubString, characterSet.size());
            } else {
                characterSet.remove(s.charAt(i));
            }
        }
        return maxSubString;
    }
}
