// write a program to find the minimum number between two numbers using function. (Function without argument but with return type




package LearningMethods;

public class ExampleMinNumber {
    public static void main(String[] args) {
        int a  =11;
        int b = 12;
        int c = minFunction(a,b);
        System.out.println("Minimun value is " + c );
    }

    public static int minFunction( int x, int y) {
        int min;
        if (x > y)
            min = y;
         else
            min = x;
         return min;
        }


    }




