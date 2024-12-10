package gr.aueb.cf.myexperiments;

public class AlphabeticShftEncryptor {

    public static String encrypt (String input, int key) {
        char[] encrypted = new char[input.length()];

        for ( int i = 0; i < input.length(); i++ ) {
            char currentChar = input.charAt(i);
            encrypted[i] = (char) ((currentChar- 'a' + key ) % 26 + 'a');
        }
        return new String(encrypted);
    }

    public static String decrypt( String input, int key ) {
        return encrypt(input,26-key);
    }

    public static void main(String[] args) {
        String original = "arianna gotzaridi";
        int key = 8;
        String encrypted = AlphabeticShftEncryptor.encrypt(original, key);
        String decrypted = AlphabeticShftEncryptor.decrypt(encrypted, key);

        System.out.println(original);
        System.out.println(encrypted);
        System.out.println(decrypted);
    }
}
