public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
        
        // Initialize pointers at the start and end of the string
        int left = 0;
        int right = cleanedStr.length() - 1;
        
        // Check characters from both ends moving towards the center
        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        
        return true; // It's a palindrome
    }

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        System.out.println("Is palindrome: " + isPalindrome(input)); // Output: true
    }
}
