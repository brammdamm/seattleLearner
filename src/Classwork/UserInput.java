package Classwork;

import java.util.Scanner;



public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("what is your name?");
        String s1 = scan.next();
        System.out.println("What is your age");
        int i = scan.nextInt();
        System.out.println("Hi " + s1 + ", your age is " + i );

        System.out.println("----------------------------------------------------------------------------------------");

        String nick_name = "San";
        System.out.println("your nick name is: " + nick_name);



    }

}
