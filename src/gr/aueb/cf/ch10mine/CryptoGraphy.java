package gr.aueb.cf.ch10mine;

import java.util.ArrayList;

public class CryptoGraphy {

public static void main(String[] args) {
    // The key should be large enough to give deciphers 0 to 127
    final int KEY = 128;
    String s = "Giannis try to get the solve THIS!#";
    String s1 = encrypt(s, KEY).toString();
    System.out.println(s1);

    String s2 = decrypt(encrypt(s, KEY), KEY).toString();
    System.out.println(s2);
}

public static ArrayList<Integer> encrypt(String s, int key) {
    ArrayList<Integer> encrypted = new ArrayList<>();
    char ch;
    int i;

    int prev = cipher(s.charAt(0), -1, key);
    encrypted.add(prev);

    i = 1;
    while ((ch = s.charAt(i)) != '#') {
        encrypted.add(cipher(ch, prev, key));
        prev = cipher(ch, prev, key);
        i++;
    }
    encrypted.add(-1);
    return encrypted;
}

    public static ArrayList<Character> decrypt(ArrayList<Integer> encrypted, int key) {
        ArrayList<Character> decrypted = new ArrayList<>();
        int token;
        int i;
        int prevToken;

        prevToken = decipher(encrypted.get(0), -1, key);
        decrypted.add((char) prevToken);

        i = 1;
        while ((token = encrypted.get(i++)) != -1) {
            decrypted.add(decipher(token, prevToken, key));
            prevToken = token;
        }

        return decrypted;
    }

    public static int cipher(char ch, int prev, int key) {
        if (prev == -1) return ch;

        // Το cipher θα είναι μεταξύ 0 και (key-1)
        return (ch + prev) % key;
    }

    public static char decipher(int cipher, int prev, int key) {
        int m;

        if (prev == -1) return (char) cipher;

        // Αν cipher-prev είναι αρνητικό θα πρέπει να διορθώσουμε με +key για να πάρουμε θετικό και άρα να τρέξει σωστά το modulo
        m = (cipher - prev + key) % key;
        return (char) m;
    }
    }
