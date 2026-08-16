public class PalindromeChecker {

    private String word;

    public PalindromeChecker(String word) {
        this.word = word;
    }

    public static boolean isPalindrome(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        String cleanedText = text.toLowerCase();
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
          
            left++;
            right--;
        }

        return true;
    }

    public void displayResult() {
        System.out.println("\n[ RESULT ]");

        if (isPalindrome(this.word)) {
            System.out.println("The word \"" + this.word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + this.word + "\" is not a palindrome.");
        }
    }
}