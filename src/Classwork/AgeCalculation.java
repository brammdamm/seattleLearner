package Classwork;


import java.util.Scanner;

public class AgeCalculation {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = s1.nextInt();
        int age1 = age+10;
        System.out.println("You will be " + age1 + " after 10 yrs.");

    }
}
