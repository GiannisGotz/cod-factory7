package gr.aueb.cf.myexperiments;

public class AlphabetShiftEncryptor {

    // Method to check if a character is a letter
    private static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    // Method to encrypt the input string with a specific number of shifts
    public static String encrypt(String input, int key) {
        char[] encrypted = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (isLetter(currentChar)) {
                char base = (currentChar >= 'a' && currentChar <= 'z') ? 'a' : 'A';
                encrypted[i] = (char) ((currentChar - base + key) % 26 + base);
            } else {
                encrypted[i] = currentChar; // Non-letter characters remain the same
            }
        }

        return new String(encrypted);
    }

    // Method to decrypt the input string with a specific number of shifts
    public static String decrypt(String input, int key) {
        return encrypt(input, 26 - key); // Decryption is the reverse of encryption
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        int key = 5;
        String encrypted = AlphabetShiftEncryptor.encrypt(original, key);
        String decrypted = AlphabetShiftEncryptor.decrypt(encrypted, key);

        System.out.println("Original: " + original);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
