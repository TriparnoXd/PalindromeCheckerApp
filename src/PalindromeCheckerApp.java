public class PalindromeCheckerApp {

    public static void main(String []args){
        String input = "madam";
        boolean isPalindrome = true;

        // Loop only till half of the string length to compare characters from both ends
        for (int i = 0; i < input.length() / 2; i++) {
            // Conditional statement to evaluate the palindrome condition
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit the loop early if a mismatch is found
            }
        }

        // Display the result on the console
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
    }
}
