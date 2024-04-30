package Cipher;
import java.util.*;

public class JaydenVigenereCipher extends JaydenCeaserCipher {
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encryptVigenere(String userWord, String key) {
        String encryptedString = "";
        key = key.toLowerCase();
        userWord = userWord.toLowerCase();
        ArrayList<Integer> characterShift = shift(key);
        int keyLength = key.length();
        for (int i = 0; i < userWord.length(); i++) {
            int shift = characterShift.get(i % keyLength);
            Character character = userWord.charAt(i);
            String stringCharacter = character.toString();
            String encryptedLetter = JaydenCeaserCipher.encrypt(stringCharacter, shift);
            encryptedString += encryptedLetter;
        }
        return encryptedString;
    }

    public static String decryptVigenere(String userWord, String key) {
        String encryptedString = "";
        key = key.toLowerCase();
        userWord = userWord.toLowerCase();
        ArrayList<Integer> characterShift = shift(key);
        int keyLength = key.length();
        for (int i = 0; i < userWord.length(); i++) {
            int shift = characterShift.get(i % keyLength);
            Character character = userWord.charAt(i);
            String stringCharacter = character.toString();
            String encryptedLetter = JaydenCeaserCipher.decryptOneKey(stringCharacter, shift);
            encryptedString += encryptedLetter;
        }
        return encryptedString;
    }

    public static ArrayList<Integer> shift(String key) {
        ArrayList<Integer> keyIndexes = new ArrayList<Integer>();
        for (int i = 0; i < key.length(); i++) {
            char keyChar = key.charAt(i);
            int keyIndex = alphabet.indexOf(keyChar);
            keyIndexes.add(keyIndex);
        }
        return keyIndexes;
    }
}



