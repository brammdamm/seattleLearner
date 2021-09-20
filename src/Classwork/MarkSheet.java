package Classwork;

import java.util.Scanner;

public class MarkSheet {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter your mark");
        int mark = s1.nextInt();

        if(mark >= 60){
            System.out.println("first division");}
         else if(mark < 60 && mark >=45){
                System.out.println("second division");}
         else{
            System.out.println("fail");

	// is this change 
            }
        }
}

