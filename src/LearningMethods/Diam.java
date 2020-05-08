//write a program to find the diameter, circumference and are of a circle using function( function with argument and no return type)

package LearningMethods;
import java.lang.Math.*;
public class Diam {
    public static void main(String[] args) {
        Diam  d = new Diam ();
        d.diameter(3);
        d.circumference(44);
        d.areaOfCircle(3);
    }
    // r is the raduis of the circle
    public static void diameter(int r){
        int d = 2*r;
        System.out.println("The diameter of the circle is: "+ d);
    }
    // x is the radius of the circle
    public static void circumference(double x){
        double cir = (2* (Math.PI) * x);
        System.out.println("The circumference of the circle is: "+ cir);}

     // y is the radius pf the circle
     public static void areaOfCircle(double y){
         double area = ((Math.PI)* y *y);
            System.out.println("the area of the circle is: " + area);
        }

    }


