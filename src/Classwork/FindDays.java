package Classwork;

import java.util.Scanner;

public class FindDays {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("please enter number for day");
        int day = scan.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

       case 2:
            System.out.println("tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("thursday");
            break;
        case 5:
            System.out.println("friday");
            break;
        case 6:
            System.out.println("Saturdday");
            break;
        case 7:
            System.out.println("sunday");
            break;
        default:

            System.out.println("enter valid number (from 1 to 7)");
        }
    }
}