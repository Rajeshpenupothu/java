public class missing {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length + 1;  // Since one number is missing
        int expectedSum = n * (n + 1) / 2;  // Sum of numbers from 1 to n
        
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;  // The difference is the missing number
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6};  // Example array with missing number 3
        System.out.println("The missing number is: " + findMissingNumber(nums));
    }
}
