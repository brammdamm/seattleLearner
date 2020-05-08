package LearningArray;

import java.util.Scanner;

public class IndexFounder {
    public static void main(String[] args) {
        int []arr = {1,2,4,5,7};

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = s.nextInt();

        int index = 0;
       for(int i =0 ; i< arr.length; i++){
           if (arr [i] == n){
               index = i;

           System.out.println(index);}

           else
               System.out.println("not found");
       }



    }




}
