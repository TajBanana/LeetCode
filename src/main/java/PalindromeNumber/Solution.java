package PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        String numberString = String.valueOf(x);
        int numberLength = numberString.length();

        int i = 0;
        int j = numberLength - 1;

        while (i < numberLength - 1) {
            boolean isSameChar = numberString.charAt(i) == numberString.charAt(j);
            i++;
            j--;

            if (!isSameChar) {
                return false;
            }
        }
        return true;
    }
}
