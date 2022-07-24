package LongestSubstringWithoutRepeatingCharacters;

import java.util.Vector;

public class Solution {
    public static void main(String[] args) {
        //System.out.println(lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
        System.out.println(Solution2.lengthOfLongestSubstring("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));

    }

    public static int lengthOfLongestSubstring(String s) {
        Vector<Character> currentSubString = new Vector<>();
        int maxSubStringSize = 0;
        int stringLength = s.length();

        for (int i = 0; i < stringLength; i++) {
            currentSubString.clear();
            char currentChar = s.charAt(i);

            int j = i;

            System.out.println("i = " + i + ", j = " + j);
            System.out.println("current char = " + currentChar);

            while (j < stringLength && !currentSubString.contains(s.charAt(j))) {
                currentSubString.add(s.charAt(j));
                j++;
            }

            System.out.println("current substring >>> " + currentSubString);

            if (currentSubString.size() > maxSubStringSize) {
                maxSubStringSize = currentSubString.size();
            }
        }
        return maxSubStringSize;
    }
}
