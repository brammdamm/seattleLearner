package Try;


import static Try.PlusMethod.plus;

public class MainTester {
    public static void main(String[] args) {
        int i = plus(3,4);
        double j = plus(3.5,6.9);

        System.out.println("The addition of two int is: " + i);
    }
}
