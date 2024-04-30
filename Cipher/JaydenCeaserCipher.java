package Cipher;

import java.util.*;

public class JaydenCeaserCipher {
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";


    public static String encrypt(String userText, int key) {
        String encryptedText = "";
        userText = userText.toLowerCase(); 
        for (int i = 0; i < userText.length(); i++) {
            char currentChar = userText.charAt(i);
            if (currentChar == ' ') {
                encryptedText += " ";
                continue;
            }
            int charIndex = alphabet.indexOf(currentChar);
            int newIndex = (charIndex + key) % 26;
            encryptedText += alphabet.charAt(newIndex);
        }
        return encryptedText;
    }

    public static String decryptOneKey(String userText, int key) {
        String decryptedText = "";
        userText = userText.toLowerCase(); 
        for (int i = 0; i < userText.length(); i++) {
            char currentChar = userText.charAt(i);
            if (currentChar == ' ') {
                decryptedText += " ";
                continue;
            }
            int charIndex = alphabet.indexOf(currentChar);
            int newIndex = (charIndex - key + 26) % 26; 
            decryptedText += alphabet.charAt(newIndex);
        }
        return decryptedText;
    }

}

