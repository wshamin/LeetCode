package valid_palindrome_125;

public class Solution {
    public boolean isPalindrome(String s) {
        String formatted = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        String firstHalf = formatted.substring(0, formatted.length() / 2);
        String secondHalf;

        if (formatted.length() % 2 == 1) {
            secondHalf = formatted.substring(formatted.length() / 2 + 1);
        } else {
            secondHalf = formatted.substring(formatted.length() / 2);
        }

        return firstHalf.contentEquals(new StringBuilder(secondHalf).reverse());
    }
}
