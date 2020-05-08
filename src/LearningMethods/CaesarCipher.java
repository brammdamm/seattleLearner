package LearningMethods;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
       Scanner s1 = new Scanner(System.in);
        System.out.println("enter text");
        String text = s1.nextLine();
        int s = 1;
     //   System.out.println("Text  : " + text);
       // System.out.println("Shift : " + s);
        System.out.println("Cipher: " + encrypt(text, s));
    }

    public static StringBuffer encrypt(String text, int s) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            if ((Character.isUpperCase(text.charAt(i)))){
                char ch = (char) (((int) text.charAt(i) + s - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) + s - 97) % 26 + 97);
                result.append(ch);
            }
        }

        return result;

    }

}
