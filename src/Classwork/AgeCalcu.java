package Classwork;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalcu {
    public static void main(String[] args) {
        int age;

        Scanner s1 = new Scanner (System.in);
        System.out.println("Enter your birth year: ");
        age = s1.nextInt();

        LocalDate c = LocalDate.now();
        int y = c.getYear();
       // System.out.println(y);
        int z = y-age;
        System.out.println("your age is: "+ z);

    }
}
