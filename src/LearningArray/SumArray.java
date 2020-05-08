package LearningArray;


import java.util.Arrays;

public class SumArray {
    public static void main(String[] args) {
        int[] first = {1,4,5,7};
        int[] second = {1,2,2,1};
 /*       int [] r = add(first,second);
        System.out.println(Arrays.toString(r));
    }

    private static int[] add(int[] first, int[] second) {

        int length = first.length < second.length ? first.length: second.length;
        int [] r = new int[length];
        for(int i =0; i< length; i++){
            r[i] = first[i]+ second[i];
        }
        return r;
   */

       int[] third  = new int [first.length];
       for(int i = 0; i< first.length; i++ ) {
           int sum  = first[i] + second[i];
           if(i==first.length-1)
               System.out.println(first[i]+second[i]);
           else
               System.out.print(first[i]+second[i]+",");
       }
       }









    }

