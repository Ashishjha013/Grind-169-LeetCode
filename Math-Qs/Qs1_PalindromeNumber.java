

public class Qs1_PalindromeNumber {
    // Make method static to call directly from main
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int n = x;
        int revNum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n = n / 10;
        }

        return revNum == x;
    }

    public static void main(String[] args) {
        // Test cases
        int[] tests = {121, -121, 10, 12321, 0};

        for (int test : tests) {
            System.out.println("Is " + test + " a palindrome? " + isPalindrome(test));
        }
    }
}
