package main.java.com.karankumar.fibonacci;

// Prints the first 10 fibonacci numbers
public class Fibonacci {
    public static void main(String[] args) {
        for (int n = 0; n < 10; n++) {
            System.out.println("main.java.com.karankumar.fibonacci.Fibonacci of " + n + " is " + runFibonnaci(n));
        }
    }

    private static int runFibonnaci(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return runFibonnaci(n-1) + runFibonnaci(n-2);
        }
    }
}
