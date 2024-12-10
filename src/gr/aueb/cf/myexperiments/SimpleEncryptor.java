package gr.aueb.cf.myexperiments;

public class SimpleEncryptor {

    public static String encrypt ( String input) {
        char[] encrypted = new char[input.length()];

        for ( int i = 0 ; i < input.length(); i++ ) {
            encrypted[i] = (char) (input.charAt(i) + 1);
        }

        return new String(encrypted);
    }

    public static String decrypt ( String input) {
        char [] decrypted = new char[input.length()];

        for ( int i = 0 ; i < input.length(); i++ ) {
            decrypted[i] = (char) (input.charAt(i) - 1);
        }

        return new String(decrypted);
    }

    public static void main(String[] args) {
        String original = "Ariana Gotzaridi";
        String encrypted = SimpleEncryptor.encrypt(original);
        String decrypted = SimpleEncryptor.decrypt(encrypted);

        System.out.println("Original: " + original);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
