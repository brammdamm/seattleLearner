package LearningArray;


import java.util.Scanner;

public class ArrayOfString {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter name");
        String name = s1.nextLine();
        Search(name);

        //String a = a1.Search(name);
       // System.out.println(a);
    }

    public static boolean Search (String name) {

        String[] n = {"birendra", "bhupen", "Ram"};
        boolean s=false;

        for (int i = 0; i < n.length; i++) {

            if (name.equals(n[i])) {
                System.out.println("found "+name);

            } else {

                System.out.println("Not found");
            }



        }
       return true;
    }



}



