// write a program to check whether a number is even or odd using function.(function without argument but with return types)
package LearningMethods;
public class EvenOdd {
    public static void main(String[] args) {
        EvenOdd e = new EvenOdd();
        String q= e.even(3);
        System.out.println(q);

    }

    public static String even(int x) {
        String s;

        if (x % 2 == 0) {
            s = "even";
        } else {
            s = "odd";
        }
        return s;
    }
}