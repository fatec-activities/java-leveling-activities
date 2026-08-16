public class TextAnalyzer {

    private String text;

    public TextAnalyzer(String text) {
        this.text = text;
    }

    public void displayAnalysis() {
        System.out.println("\n[ RESULTS ]");

        if (this.text.isEmpty()) {
            System.out.println("The entered text is empty.");
            return;
        }

        System.out.println("Character count: " + getCharacterCount());
        System.out.println("Space count: " + getSpaceCount());
        System.out.println("Vowel count: " + getVowelCount());
        System.out.println("Consonant count: " + getConsonantCount());
        System.out.println("Digit count: " + getDigitCount());
        System.out.println("First character: " + getFirstCharacter());
        System.out.println("Last character: " + getLastCharacter());
    }

    public int getCharacterCount() {
        return this.text.length();
    }

    public int getSpaceCount() {
        int count = 0;

        for (int i = 0; i < this.text.length(); i++) {
            if (Character.isWhitespace(this.text.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public int getVowelCount() {
        int count = 0;
        String lowerText = this.text.toLowerCase();

        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public int getConsonantCount() {
        int count = 0;
        String lowerText = this.text.toLowerCase();

        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);

            if (Character.isLetter(ch) && !isVowel(ch)) {
                count++;
            }
        }

        return count;
    }

    public int getDigitCount() {
        int count = 0;

        for (int i = 0; i < this.text.length(); i++) {
            if (Character.isDigit(this.text.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public char getFirstCharacter() {
        return this.text.charAt(0);
    }

    public char getLastCharacter() {
        return this.text.charAt(this.text.length() - 1);
    }

    private boolean isVowel(char ch) {
        char lowerCh = Character.toLowerCase(ch);
        return lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u';
    }
}