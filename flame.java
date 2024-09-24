public class PalindromeChecker {

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input)); // Output: true
    }

    public static boolean isPalindrome(String s) {
        // Normalize the string: remove non-alphanumeric characters and convert to lowercase
        StringBuilder normalizedString = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                normalizedString.append(Character.toLowerCase(c));
            }
        }
        
        // Check if the normalized string is a palindrome
        String normalized = normalizedString.toString();
        String reversed = normalized.reverse().toString();
        
        return normalized.equals(reversed);
    }
}
