package LearningArray;

import java.util.Scanner;

public class Try {

    public static void main(String[] args) {
        String[] names = {"ram", "john", "maya"};
        String input = new Scanner(System.in).nextLine();
        boolean found = findName(names, input);
        if (found)
            System.out.println("User found");
        else
            System.out.println("User Not found");
    }

    private static boolean findName(String[] names, String param) {
        boolean isFound = false;
        for (String name : names) {
            if (name.equals(param))
                isFound = true;
            else
                isFound = false;
        }
        return isFound;
    }

}