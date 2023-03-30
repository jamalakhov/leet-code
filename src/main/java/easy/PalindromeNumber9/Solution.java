package easy.PalindromeNumber9;

public class Solution {
    public boolean isPalindrome(int x) {
        int origin = x;
        int reversed = 0;

        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        return origin == reversed;
    }
}