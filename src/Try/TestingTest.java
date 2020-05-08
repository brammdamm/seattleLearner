package Try;

import java.util.Scanner;

public class TestingTest {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter name");
        String s = s1.nextLine();

        String[] n = {"birendra", "bhupen", "Ram"};



      // public static String Search (String name) {

            for (int i = 0; i < n.length; i++) {
                if (n[i].equals(s)) {
                    System.out.println("match");

                } else {
                    //s = "false";
                    System.out.println("does not match");
                }

            }


        }
}