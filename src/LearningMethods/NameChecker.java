// wap a program to check whether the provide string "Name" from user using Scanner class starts with 0 or not.

package LearningMethods;
import java.util.Scanner;
public class NameChecker {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("What is your Name?");
        String name = Scan.nextLine();

        NameChecker p = new NameChecker();
        String q = p.check(name);
        System.out.println(q);
    }


    public static String check(String x) {
        String s;
        if ((x.charAt(0) == 'p') || (x.charAt(0) == 'P') ) {
            s = "Name start with p";
        } else {
            s = "Name doesnot start with p";
        }
        return s;
    }

}