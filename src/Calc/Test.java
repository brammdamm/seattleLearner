package Calc;


public class Test {
    public static void main(String[] args) {
Calculator c= new Calculator();
    c.add();
    c.sub(4,6);
    c.multiply(5,7);

        int z = c.divide(2,2);
        System.out.println("The division of two number is " + z);
    }
}
