public class PalindromeCheckerApp {

    public static void main(String []args){
        String input = "madam"; // Hardcoded string for validation
        String reversed = "";

        // Iterate from the last character to the first.
        for (int i = input.length() - 1; i >= 0; i--) {
            // String Concatenation (+) - Used to build the reversed string character by character
            reversed += input.charAt(i);
        }

        // Compare actual content using the equals() Method
        boolean isPalindrome = input.equals(reversed);

        // Display the result
        System.out.println("Input text: " + input);
        System.out.println("Reversed text: " + reversed);
        System.out.println("Is it a Palindrome?: " + isPalindrome);
    }
}
