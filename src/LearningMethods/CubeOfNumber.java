package LearningMethods;
//function with no argument and no return type


import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] args) {

        CubeOfNumber C = new CubeOfNumber();
         C.cube();

    }

 public static void cube() {
     int x;
     Scanner s = new Scanner(System.in);
     System.out.println("Please enter a number");
     x = s.nextInt();
     int z = x * x * x;
      System.out.println("The cube of given number is" + z);}
 }
