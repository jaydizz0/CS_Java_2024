package Cipher;

public class JaydenMainCipher extends JaydenVigenereCipher{
    public static void main(String[] args){
        System.out.println(JaydenVigenereCipher.encryptVigenere("attacking tonight", "OCULORHINOLARINGOLOGY"));
        System.out.println(JaydenVigenereCipher.decryptVigenere("ltvh aootqg", "allday"));
    }
}
