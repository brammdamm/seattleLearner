package Classwork;

import java.util.Scanner;

public class ItemPrice {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("what is your name");
        String name = Scan.nextLine();
        System.out.println("please enter the price of first items: ");
        int item1 = Scan.nextInt();
        System.out.println("please enter the price of second items: ");
        double item2 = Scan.nextDouble();
        System.out.println("please enter the price of third items: ");
        int item3 = Scan.nextInt();
        double total = item1+ item2+item3;
        System.out.println("your total price is "+ total);
        double tax = ((0.05*total));
        double after_tax = total+tax;
        System.out.println("total after tax :" + after_tax );
        double tip;
        System.out.println("Please enter tips");
        tip = Scan.nextDouble();
        double final_price= tip+ after_tax;
        System.out.println(name + " your final total price after tax, tips = " + final_price);
    }
}
