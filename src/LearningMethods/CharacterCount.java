package LearningMethods;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter something");
        String s1 = s.nextLine();

        CharacterCount c = new CharacterCount();
        int z  =  c.getCharCount(s1);
        System.out.println("total count is " +z );
    }

    public static int getCharCount(String s1){

        return  (s1.length());
    }
}
