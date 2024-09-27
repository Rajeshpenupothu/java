import java.util.Scanner;

public class PalindromeChecker {

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends of the string
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input (string or number)
        System.out.print("Enter a string or number: ");
        String input = scanner.nextLine();

        // Remove any non-alphanumeric characters and convert to lowercase
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check if input is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }

        scanner.close();
    }
}
