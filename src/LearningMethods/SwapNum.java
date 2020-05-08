package LearningMethods;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int x = scan.nextInt();
        System.out.println("Please enter second number");
        int y = scan.nextInt();
        swap(x,y);
    }

public static void swap(int a, int b){
       // int a;
        //int b;
    System.out.println("Number before swapping are: " + a +" and "+ b);
    int c = a;
    a = b;
    b= c;
    System.out.println("Number after swapping are: "+ a + " and "+ b );
}







}
