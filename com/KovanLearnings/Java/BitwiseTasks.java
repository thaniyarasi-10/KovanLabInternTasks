package com.KovanLearnings.Java;
import java.util.Scanner;
public class BitwiseTasks {
    public static String encrypt(String message, int key) {

        //Encrypt
        StringBuilder cipher = new StringBuilder();
        for (char i: message.toCharArray()){
            cipher.append((char) (i + key));
        }
        return cipher.toString();
    }
    public static String decrypt(String cipher, int key){
        StringBuilder msg = new StringBuilder();
        for( char i: cipher.toCharArray()){
            msg.append((char)(i - key));
        }
        return msg.toString();
    }
    public static String xorEncrypt(String message, int key) {
        StringBuilder cipher = new StringBuilder();

        for (char ch : message.toCharArray()) {
            cipher.append((char) (ch ^ key));
        }

        return cipher.toString();
    }

    // XOR-based decryption (same logic)
    public static String xorDecrypt(String cipher, int key) {
        StringBuilder message = new StringBuilder();

        for (char ch : cipher.toCharArray()) {
            message.append((char) (ch ^ key));
        }

        return message.toString();
    }

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        String message = sc.nextLine();
        int key = sc.nextInt();
        String encrypted= encrypt(message, key);
        String decrypted = decrypt (encrypted,key);
        String xorEncrypted = xorEncrypt(message, key);

        System.out.println(encrypted);
        System.out.println(decrypted);
        System.out.println(decrypt(encrypt(message, key), key));
        System.out.println(xorEncrypt(message,key));
        System.out.println(xorDecrypt(xorEncrypted,key));

    }
}
