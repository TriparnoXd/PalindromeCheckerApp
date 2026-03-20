public class PalindromeCheckerApp {

    public static void main(String []args){
        String input = "noon";

        // Create a Stack to store characters.
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Iterate again through the original string.
        for (char c : input.toCharArray()) {
            // Pop Operation removes characters in reverse order
            if (c != stack.pop()) {
                isPalindrome = false;
                break; // Exit the loop early if a mismatch is found
            }
        }

        // Display the expected output
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}
